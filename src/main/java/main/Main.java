package main;

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
        System.out.println("message");
    }
}