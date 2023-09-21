package bary;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//
public class BarySystem extends BaryObject {
    private static final int BARY_MASS_TO_RADIUS_COEFFICIENT = 5;
    public final @NotNull List<BaryObject> objects; //TODO: add getters and make this private

    private double mass, radius; //precalculated, updated

    //
    public BarySystem(@Nullable BarySystem parent) {
        super(parent);
        objects = new ArrayList<>();
        addToParent();
    }

    //
    @Override
    public double getMass() {
        return this.mass;
    }

    //
    @Override
    public double getRadius() {
        return this.radius;
    }

    //use this to add objects
    public void addObject(@Nullable BaryObject object) throws NullBaryObjectException {
        if (object == null) throw new NullBaryObjectException();
        objects.add(object);
        update();
    }

    /**
     * Updates mass and radius.
     */
    public void update() {
        updateMass();
        updateRadius();
        updateParent();
    }

    private void updateMass() {
        double mass = 0;
        for (BaryObject object : objects) {
            mass += object.getMass();
        }
        this.mass = mass;
    }

    private void updateRadius() {
        this.radius = getBaryRadiusFromMass(getMass());
    }

    private static double getBaryRadiusFromMass(double mass) {
        //TODO: finish this
        return mass * BARY_MASS_TO_RADIUS_COEFFICIENT;
    }

    private void updateParent() {
        if (parent != null) {
            parent.update();
        }
    }
}