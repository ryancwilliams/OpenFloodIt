/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.core;

/**
 *
 * @author ryanwilliams
 */
public interface Game {
    /**
     * Gets the Grid for this game.
     * @return the Grid for this game.
     */
    public Grid getGrid();
    /**
     * Creates a new game.
     */
    public void newGame();
}
