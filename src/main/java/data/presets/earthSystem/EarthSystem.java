package data.presets.earthSystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;

//
public class EarthSystem extends BarySystem {
    //
    public EarthSystem(@Nullable BarySystem parent) {
        super(parent);
        new Earth(this);
    }
}