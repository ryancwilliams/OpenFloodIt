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
    public Grid(int width, int height, Generator generator, CellType... cellTypes) {
        this.HEIGHT = height;
        this.WIDTH = width;        
        this.cellTypes = cellTypes;
        this.grid = generator.generate(this.WIDTH, this.HEIGHT, this.cellTypes);
    }
    public CellType getCell(int x, int y) {
        return grid[x][y];
    }
}
