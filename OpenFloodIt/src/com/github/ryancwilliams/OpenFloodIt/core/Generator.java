/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.core;

/**
 *
 * @author ryanwilliams
 */
public interface Generator {
    /**
     * Generates a 2D CellType array.
     * @param width the width of the array.
     * @param height the height of the array.
     * @return the array.
     */
    public CellType[][] generate(int width,int height,CellType... cellTypes);
}
