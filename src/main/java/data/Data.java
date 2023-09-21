package data;

import bary.*;

//
public class Data {
    public static final BaryObject BARY_SYSTEM;
    private static final BaryObject BARY_BODY_1, BARY_BODY_2, BARY_BODY_3;

    static {
        BARY_SYSTEM = new BarySystem(null);

        BARY_BODY_1 = new BaryBody((BarySystem) BARY_SYSTEM, 0, 0);
        BARY_BODY_2 = new BaryBody((BarySystem) BARY_SYSTEM, 0, 0);
        BARY_BODY_3 = new BaryBody((BarySystem) BARY_SYSTEM, 0, 0);

        ((BarySystem) BARY_SYSTEM).addObject(BARY_BODY_1);
        ((BarySystem) BARY_SYSTEM).addObject(BARY_BODY_2);
        ((BarySystem) BARY_SYSTEM).addObject(BARY_BODY_3);
        System.out.println("New BarySystem created.");
    }
}