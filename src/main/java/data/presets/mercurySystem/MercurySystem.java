package data.presets.mercurySystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;

//
public class MercurySystem extends BarySystem {
    //
    public MercurySystem(@Nullable BarySystem parent) {
        super(parent);
        new Mercury(this);
    }
}