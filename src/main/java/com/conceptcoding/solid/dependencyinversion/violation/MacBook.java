package com.conceptcoding.solid.dependencyinversion.violation;


import com.conceptcoding.solid.dependencyinversion.utility.Keyboard;
import com.conceptcoding.solid.dependencyinversion.utility.Mouse;
import com.conceptcoding.solid.dependencyinversion.utility.WiredKeyboard;
import com.conceptcoding.solid.dependencyinversion.utility.WiredMouse;

// VIOLATION OF DIP
// High-level module directly depending on low-level module
public class MacBook {

    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    // Direct dependency on concrete class
    public MacBook(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        keyboard = wiredKeyboard; // Tight coupling
        mouse = wiredMouse; // Tight coupling
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return (Keyboard) keyboard;

    }

}
