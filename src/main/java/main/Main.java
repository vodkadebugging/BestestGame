package main;

import data.Data;
import graphics.GraphicsAdapter;

//
public class Main {
    //
    public static void main(String[] args) {
        new Main();
    }

    //
    public Main() {
        doSomething();
    }

    private void doSomething() {
        new GraphicsAdapter();
        System.out.println("Mass: " + Data.BARY_SYSTEM.getMass() + ", radius: " + Data.BARY_SYSTEM.getRadius());
    }
}