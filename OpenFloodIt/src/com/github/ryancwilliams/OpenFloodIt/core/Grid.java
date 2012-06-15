/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.core;

/**
 *
 * @author ryanwilliams
 */
public class Grid {
    private CellType[][] grid;
    private CellType[] cellTypes;
    public final int WIDTH;
    public final int HEIGHT;
    
    private boolean[][] controlled;
    /**
     * Creates a new grid.
     * @param width the width of the grid.
     * @param height the height of the grid.
     * @param generator the generator used to generate the grid.
     * @param cellTypes the cell types to use.
     */
    public Grid(int width, int height, Generator generator, CellType... cellTypes) {
        this.HEIGHT = height;
        this.WIDTH = width;        
        this.cellTypes = cellTypes;
        this.grid = generator.generate(this.WIDTH, this.HEIGHT, this.cellTypes);
        
        this.controlled = new boolean[this.WIDTH][this.HEIGHT];
        this.controlled[0][0] = true; 
    }
    /**
     * Gets the cell type for the address.
     * @param column the column
     * @param column the column
     * @return  the CellType for that cell
     */
    public CellType getCell(int column, int row) {
        return grid[column][row];
    }
    /**
     * Gets the CellTypes used for this grid.
     * @return the CellTypes used for this grid.
     */
    public CellType[] getCellTypes() {
        return this.cellTypes;
    }
    /**
     * Casts the controlled cells to a specific CellType.
     * @param cellType the cellType to cast to.
     */
    public void setGrid(CellType cellType) {
        // Cast the controlled cells
        // columns
        for(int column = 0; column < this.WIDTH;column++) {
            // rows
            for(int row = 0; row < this.HEIGHT;row++) {
                if(this.controlled[column][row] == true) {
                    castControlledCell(column, row, cellType);
                }
            }
        }
    }
    /**
     * Casts a cell to a specific CellType
     * @param column the column of the cell.
     * @param column the column of the cell.
     * @param to the CellType to cast the cell to.
     */
    private void castCell(int column,int row,CellType to) {
        // Check to see if this cell is valid
        if(!cellValid(column, row)){
            // Return void if cell is not valid
            return;
        }
        // Check to see if this cell is controlled
        if(this.controlled[column][row] == false) {
            // Store the old to
            CellType from = this.grid[column][row];
            // Set the cell to this type
            this.grid[column][row] = to;
            // Make this cell controlled
            this.controlled[column][row] = true;
            // Cast nearby cells
            castAdjCells(column, row, from, to);
        }
    }
    /**
     * Casts a cell to a specific CellType. This method is only used for controlled cells.
     * @param column the column of the cell.
     * @param column the column of the cell.
     * @param to the CellType to cast the cell to.
     */
    private void castControlledCell(int column,int row,CellType to) {
        // Check to see if this cell is valid
        if(!cellValid(column, row)){
            // Return void if cell is not valid
            return;
        }
        // Store the old to
        CellType from = this.grid[column][row];
        // Set the cell to this type
        this.grid[column][row] = to;
        // Cast nearby cells
        castAdjCells(column, row, from, to);
    }
    /**
     * Casts adjacent cells of a specific type.
     * @param column the column of the center cell.
     * @param column the column of the center cell.
     * @param from the CellType to convert from.
     * @param to the CellType to convert to.
     */
    private void castAdjCells(int column,int row,CellType from,CellType to) {
        if(this.grid[(column + 1)][row] == from) {
            castCell((column + 1),row, to);
        }
        if(this.grid[(column - 1)][row] == from) {
            castCell((column - 1),row, to);
        }
        if(this.grid[column][(row + 1)] == from) {
            castCell(column,(row + 1), to);
        }
        if(this.grid[column][(row - 1)] == from) {
            castCell(column,(row - 1), to);
        }
    }
    /**
     * Checks to see if the cell is valid.
     * @param column the column of the cell.
     * @param column the column of the cell.
     * @return TRUE if the cell is valid.
     */
    private boolean cellValid(int column,int row) {
        //check column
        if(0 <= column && column < this.WIDTH) {
            //check column
            if(0 <= row && row < this.HEIGHT) {
                return true;
            }
        }
        return false;
    }
}
