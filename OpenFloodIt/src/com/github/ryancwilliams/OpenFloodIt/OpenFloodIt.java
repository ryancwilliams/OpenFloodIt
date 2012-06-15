
package com.github.ryancwilliams.OpenFloodIt;

import com.github.ryancwilliams.OpenFloodIt.core.Game;
import com.github.ryancwilliams.OpenFloodIt.gui.GameWindow;

/**
 *
 * @author ryanwilliams
 */
public class OpenFloodIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameWindow.createGameWindow("Open Flood-It", new PlayerGame());
    }
}
