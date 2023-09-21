package data.presets.solarSystem;

import org.jetbrains.annotations.Nullable;

import bary.BarySystem;
import data.presets.StellarSystem;
import data.presets.mercurySystem.MercurySystem;
import data.presets.venusSystem.VenusSystem;
import data.presets.earthSystem.EarthSystem;
import data.presets.marsSystem.MarsSystem;

//
public class SolarSystem extends StellarSystem {
    //
    public SolarSystem(@Nullable BarySystem parent) {
        super(parent);
        new Sun(this);
        new MercurySystem(this);
        new VenusSystem(this);
        new EarthSystem(this);
        new MarsSystem(this);
    }
}