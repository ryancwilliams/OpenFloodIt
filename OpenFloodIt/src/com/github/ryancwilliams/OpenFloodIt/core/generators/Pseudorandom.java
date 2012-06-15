/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.core.generators;

import com.github.ryancwilliams.OpenFloodIt.core.CellType;
import com.github.ryancwilliams.OpenFloodIt.core.Generator;
import java.util.Random;

/**
 *
 * @author ryanwilliams
 */
public class Pseudorandom implements Generator {
    private Random randomNumberGenerator;
    private CellType[] cellTypes;
    private int cellTypesCount;

    @Override
    public CellType[][] generate(int width, int height, CellType... cellTypes) {
        
        // Load cellTypes
        this.cellTypes = cellTypes;
        // Set number of cellTypes
        this.cellTypesCount = this.cellTypes.length;
        
        // Create the grid
        CellType[][] grid = new CellType[width][height];
        
        // Create the random number generator
        randomNumberGenerator = new Random();
        
        // Populate the grid
        // rows
        for(int widthC = 0; widthC < width;widthC++) {
            // colums
            for(int heightC = 0; heightC < height;heightC++) {
                grid[widthC][heightC] = generateCell();
            }
        }
        
        // Return the grid
        return grid;
    }
    
    private CellType generateCell() {
        int typeIndex = this.randomNumberGenerator.nextInt(this.cellTypesCount);
        return this.cellTypes[typeIndex];
    }
}
