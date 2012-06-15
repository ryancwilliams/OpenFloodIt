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
public class CastPanel extends JPanel {
    public CastPanel(GridPanel gridPanel,Grid grid) {
        setLayout(new GridLayout(0, 3));
        
        //Add the butons
        int cellTypeCount = grid.getCellTypes().length;
        for(int index = 0;index < cellTypeCount;index++) {
            add(new CastButton(index, gridPanel, grid));
        }
        
        setPreferredSize(new Dimension((20 * 3), (20 * 2)));
    }
}
