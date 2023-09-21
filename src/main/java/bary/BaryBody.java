package bary;

//
public class BaryBody extends BaryObject {
    private double mass, radius;

    //
    public BaryBody(double mass, double radius) {
        super();
        setMass(mass);
        setRadius(radius);
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