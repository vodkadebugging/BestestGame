package data;

import bary.BaryBody;
import bary.BaryObject;
import bary.BarySystem;

//
public class Data {
    public static final BaryObject BARY_SYSTEM;
    private static final BaryObject BARY_OBJECT_1, BARY_OBJECT_2, BARY_OBJECT_3;

    static {
        BARY_OBJECT_1 = new BaryBody(0, 0);
        BARY_OBJECT_2 = new BaryBody(0, 0);
        BARY_OBJECT_3 = new BaryBody(0, 0);

        BARY_SYSTEM = new BarySystem();
        ((BarySystem) BARY_SYSTEM).addObject(BARY_OBJECT_1);
        ((BarySystem) BARY_SYSTEM).addObject(BARY_OBJECT_2);
        ((BarySystem) BARY_SYSTEM).addObject(BARY_OBJECT_3);
        System.out.println("New BarySystem created.");
    }
}