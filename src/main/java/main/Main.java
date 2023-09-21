package main;

import static console.Utils.printLine;
import static console.BaryPrinter.printBaryObjectInfo;

import data.Data;
import data.DefaultData;
import graphics.GraphicsAdapter;

//
public class Main {
    //
    public static void main(String[] args) {
        printArgsInfo(args);
        new Main(new DefaultData());
    }

    private static void printArgsInfo(String[] args) {
        String argsCountString = "Received args : ";
        if (args == null) {
            argsCountString += "null";
        } else {
            argsCountString += Integer.toString(args.length);
        }
        printLine(argsCountString);
        printLine();
    }

    //
    public Main(Data data) {
        printBaryObjectInfo(data.getRoot());
        new GraphicsAdapter();
    }
}