package bary;

import org.jetbrains.annotations.Nullable;

//
public class BaryBody extends BaryObject {
    private double mass, radius;

    //
    public BaryBody(@Nullable BarySystem parent,
                    double mass, double radius) {
        super(parent);
        setMass(mass);
        setRadius(radius);
        addToParent();
    }

    //
    @Override
    public double getMass() {
        return this.mass;
    }

    //
    public void setMass(double mass) {
        this.mass = mass;
    }

    //
    @Override
    public double getRadius() {
        return this.radius;
    }

    //
    public void setRadius(double radius) {
        this.radius = radius;
    }
}