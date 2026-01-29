package com.conceptcoding.solid.dependencyinversion.solution;

import com.conceptcoding.solid.dependencyinversion.utility.*;

public class DemoSolution {

    public static void main(String[] args) {

        WiredKeyboard wiredKeyboard =
                new WiredKeyboard("USB", "Dell", "F602", "Grey");
        WiredMouse wiredMouse =
                new WiredMouse("USB", "Dell", "F602", "Grey");

        BluetoothKeyboard bluetoothKeyboard =
                new BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");
        BluetoothMouse bluetoothMouse =
                new BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");

        // MacBook with wired keyboard and mouse
        MacBook macBookWithWiredParts =
                new MacBook(wiredKeyboard, wiredMouse);

        macBookWithWiredParts.getKeyboard().getSpecifications();
        macBookWithWiredParts.getMouse().getSpecifications();

        // MacBook with bluetooth keyboard and mouse
        MacBook macBookWithBluetoothParts =
                new MacBook(bluetoothKeyboard, bluetoothMouse);

        macBookWithBluetoothParts.getKeyboard().getSpecifications();
        macBookWithBluetoothParts.getMouse().getSpecifications();
    }
}
