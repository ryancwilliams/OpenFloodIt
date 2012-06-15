/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.gui;

import com.github.ryancwilliams.OpenFloodIt.core.CellType;
import com.github.ryancwilliams.OpenFloodIt.core.Grid;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ryanwilliams
 */
public class CastButton extends JButton {
    private Grid grid;
    private CellType cellType;
    private GridPanel gridPanel;
    public CastButton(int cellNum,GridPanel gridPanel,Grid grid) {
        this.gridPanel = gridPanel;
        
        // Set up values
        this.grid = grid;
        this.cellType = grid.getCellTypes()[cellNum];
        
        // Set up button
        setBackground(this.cellType.COLOR);
        setPreferredSize(new Dimension(20, 20));
        addActionListener(new ButtonPressed());
    }
    private class ButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            grid.setGrid(cellType);
            gridPanel.update();
        }
        
    }
}
