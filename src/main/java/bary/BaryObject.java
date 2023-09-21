package bary;

//
public abstract class BaryObject {
    BarySystem parent; //TODO: add getters and setters

    //
    BaryObject(BarySystem parent) {
        this.parent = parent;
    }

    //
    public abstract double getMass();

    //
    public abstract double getRadius();
}