package data.presets.venusSystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;

//
public class VenusSystem extends BarySystem {
    //
    public VenusSystem(@Nullable BarySystem parent) {
        super(parent);
        new Venus(this);
    }
}