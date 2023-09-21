package data.presets;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;
import bary.BaryBody;

//
public class Planet extends BaryBody {
    //
    public Planet(@Nullable BarySystem parent,
                  double mass, double radius) {
        super(parent, mass, radius);
    }
}