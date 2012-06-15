/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.OpenFloodIt.core;

import java.awt.Color;

/**
 *
 * @author ryanwilliams
 */
public class CellType {
    public final Color COLOR;
    public final String NAME;
    public CellType(String name, Color color) {
        this.NAME = name;
        this.COLOR = color;
    }
}
