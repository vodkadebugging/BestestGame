package data.presets.venusSystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;
import data.presets.Planet;

//
public class Venus extends Planet {
    private static final double
            MASS = 20,
            RADIUS = 10;

    //
    public Venus(@Nullable BarySystem parent) {
        super(parent, MASS, RADIUS);
    }
}