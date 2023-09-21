package data.presets.solarSystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;
import data.presets.Star;

//
public class Sun extends Star {
    private static final double
            MASS = 100,
            RADIUS = 20;

    //
    public Sun(@Nullable BarySystem parent) {
        super(parent, MASS, RADIUS);
    }
}