/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.gui;

import com.github.ryancwilliams.OpenFloodIt.core.Grid;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author ryanwilliams
 */
public class GridPanel extends JPanel {
    public final int GRID_WIDTH;
    public final int GRID_HEIGHT;
    
    private GridCellPanel[] cell;
    
    public GridPanel(Grid grid) {
        // Set values
        this.GRID_WIDTH = grid.WIDTH;
        this.GRID_HEIGHT = grid.HEIGHT;
        
        // Create the layout
        setLayout(new GridLayout(GRID_HEIGHT,GRID_WIDTH));
        
        // Create the grid
        cell = new GridCellPanel[(GRID_WIDTH * GRID_HEIGHT)];
        int cellArrayIndex = 0;
        // rows
        for(int Column = 0; Column < GRID_WIDTH;Column++) {
            // colums
            for(int Row = 0; Row < GRID_HEIGHT;Row++) {
                // Create the GridCell
                cell[cellArrayIndex] = new GridCellPanel(Column, Row, grid);
                add(cell[cellArrayIndex]);
                cellArrayIndex++;
            }
        }
        
        // Setup the panel
        setPreferredSize(new Dimension(GRID_WIDTH * 20, GRID_HEIGHT * 20));
    }
    public void update() {
        // Update the grid
        int length = cell.length;
        for (int index = 0; index < length; index++) {
            cell[index].update();
        }
    }
}
