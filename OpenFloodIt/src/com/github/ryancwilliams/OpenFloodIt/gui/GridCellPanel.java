/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.gui;

import com.github.ryancwilliams.OpenFloodIt.core.Grid;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author ryanwilliams
 */
public class GridCellPanel extends JPanel {
    public final int ROW;
    public final int COLUMN;
    private Grid grid;
    
    public GridCellPanel(int column,int row,Grid grid) {
        // Set up values
        this.ROW = row;
        this.COLUMN = column;
        
        this.grid = grid;
        
        // Set up panel
        setPreferredSize(new Dimension(20, 20));
        this.update();
    }
    public final void update() {
        setBackground(grid.getCell(COLUMN, ROW).COLOR);
    }
}
