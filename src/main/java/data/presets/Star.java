package data.presets;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;
import bary.BaryBody;

//
public class Star extends BaryBody {
    //
    public Star(@Nullable BarySystem parent,
                double mass, double radius) {
        super(parent, mass, radius);
    }
}