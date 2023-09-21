package data;

import bary.BarySystem;
import bary.BaryBody;

//
public class DefaultData extends Data {
    private static final BarySystem
            rootSystem = new BarySystem(null);

    private static final BaryBody
            star = new BaryBody(rootSystem, 100, 20),
            planet1 = new BaryBody(rootSystem, 20, 10);

    private static final BarySystem
            system1 = new BarySystem(rootSystem),
            system2 = new BarySystem(rootSystem);

    private static final BaryBody
            planet2 = new BaryBody(system1, 20, 10),
            moon1 = new BaryBody(system1, 10, 5),

            planet3 = new BaryBody(system2, 20, 10),
            moon2 = new BaryBody(system2, 10, 5),
            moon3 = new BaryBody(system2, 10, 5),

            planet4 = new BaryBody(rootSystem, 20, 10);

    //
    public DefaultData() {
        super(rootSystem);
    }
}