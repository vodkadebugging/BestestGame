package data.presets.marsSystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;
import data.presets.Planet;

//
public class Mars extends Planet {
    private static final double
            MASS = 20,
            RADIUS = 10;

    //
    public Mars(@Nullable BarySystem parent) {
        super(parent, MASS, RADIUS);
    }
}