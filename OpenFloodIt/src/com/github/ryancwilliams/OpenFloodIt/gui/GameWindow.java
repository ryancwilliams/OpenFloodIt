/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.gui;

import com.github.ryancwilliams.OpenFloodIt.core.Game;
import javax.swing.JFrame;

/**
 *
 * @author ryanwilliams
 */
public class GameWindow {
    public static void createGameWindow(String name,Game game) {
        //Create a JFrame
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add the content panel
        frame.getContentPane().add(new GameWindowPanel(game));
        
        //Finsh up the window
        frame.pack();
        frame.setVisible(true);
    }
}
