/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.gui;

import com.github.ryancwilliams.OpenFloodIt.core.Game;
import javax.swing.JPanel;

/**
 *
 * @author ryanwilliams
 */
public class GameWindowPanel extends JPanel {
    
    public GameWindowPanel(Game game) {       
        GridPanel grid = new GridPanel(game.getGrid());
        
        add(new CastPanel(grid, game.getGrid()));
        
        add(grid);
    }
}
