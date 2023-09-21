package bary;

import java.util.List;
import java.util.ArrayList;

//
public class BarySystem extends BaryObject {
    final List<BaryObject> objects; //TODO: add getters and make this private

    private double mass, radius; //precalculated, updated

    //
    public BarySystem(BarySystem parent) {
        super(parent);
        objects = new ArrayList<>();
    }

    //
    @Override
    public double getMass() {
        return this.mass;
    }

    //
    public void updateMass() {
        double mass = 0;
        for (BaryObject object : objects) {
            mass += object.getMass();
        }
        this.mass = mass;
    }

    //
    @Override
    public double getRadius() {
        return this.radius;
    }

    //
    public void updateRadius() {
        this.radius = getBaryRadiusFromMass(getMass());
    }

    private static double getBaryRadiusFromMass(double mass) {
        //TODO: finish this
        return 0;
    }

    //use this to add objects
    public void addObject(BaryObject object) {
        objects.add(object);
        updateMass();
        updateRadius();
    }
}
