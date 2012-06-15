/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt;

import com.github.ryancwilliams.OpenFloodIt.core.CellType;
import com.github.ryancwilliams.OpenFloodIt.core.Game;
import com.github.ryancwilliams.OpenFloodIt.core.Grid;
import com.github.ryancwilliams.OpenFloodIt.core.generators.Pseudorandom;
import java.awt.Color;

/**
 *
 * @author ryanwilliams
 */
public class PlayerGame implements Game {
    private Grid grid;
    public PlayerGame() {
        this(16,16);
    }
    public PlayerGame(int width, int height) {
        CellType[] cellTypes = genCellTypes();
        this.grid = new Grid(width, height, new Pseudorandom(), cellTypes);
    }
    @Override
    public Grid getGrid() {
        return this.grid;
    }

    @Override
    public void newGame() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private CellType[] genCellTypes() {
        int length = 6;
        CellType[] cellTypes = new CellType[length];
        
        // Create types
        cellTypes[0] = new CellType("Red", Color.RED);
        cellTypes[1] = new CellType("Green", Color.GREEN);
        cellTypes[2] = new CellType("Blue", Color.BLUE);
        cellTypes[3] = new CellType("Cyan", Color.CYAN);
        cellTypes[4] = new CellType("Magenta", Color.MAGENTA);
        cellTypes[5] = new CellType("Yellow", Color.YELLOW);
        
        // Return the types
        return cellTypes;
    }

    @Override
    public void castGrid(CellType to) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
