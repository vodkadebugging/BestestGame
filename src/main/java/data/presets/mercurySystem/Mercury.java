package data.presets.mercurySystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;
import data.presets.Planet;

//
public class Mercury extends Planet {
    private static final double
            MASS = 20,
            RADIUS = 10;

    //
    public Mercury(@Nullable BarySystem parent) {
        super(parent, MASS, RADIUS);
    }
}