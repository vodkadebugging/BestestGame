package data;

import data.presets.StellarSystem;
import data.presets.solarSystem.SolarSystem;

//
public class DefaultData extends Data {
    private static final StellarSystem SOLAR_SYSTEM = new SolarSystem(null);

    //
    public DefaultData() {
        super(SOLAR_SYSTEM);
    }
}