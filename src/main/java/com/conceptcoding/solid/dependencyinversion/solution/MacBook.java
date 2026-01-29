package com.conceptcoding.solid.dependencyinversion.solution;

import com.conceptcoding.solid.dependencyinversion.utility.Keyboard;
import com.conceptcoding.solid.dependencyinversion.utility.Mouse;

// Following DIP
// High-level module uses abstraction
public class MacBook {

    private final Keyboard keyboard;
    private final Mouse mouse;

    // Abstraction - defines contract
    // Dependency injection through constructor
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }


    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
