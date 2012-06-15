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
    }
    /**
     * Gets the cell type for the address.
     * @param Column the Column
     * @param Row the Row
     * @return  the CellType for that cell
     */
    public CellType getCell(int Column, int Row) {
        return grid[Column][Row];
    }
}
