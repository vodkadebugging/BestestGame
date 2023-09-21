package data.presets.earthSystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;
import data.presets.Planet;

//
public class Earth extends Planet {
    private static final double
            MASS = 20,
            RADIUS = 10;

    //
    public Earth(@Nullable BarySystem parent) {
        super(parent, MASS, RADIUS);
    }
}