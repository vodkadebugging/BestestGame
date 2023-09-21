package data.presets.marsSystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;

//
public class MarsSystem extends BarySystem {
    //
    public MarsSystem(@Nullable BarySystem parent) {
        super(parent);
        new Mars(this);
    }
}