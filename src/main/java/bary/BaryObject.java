package bary;

import org.jetbrains.annotations.Nullable;

//
public abstract class BaryObject {
    public @Nullable BarySystem parent; //TODO: add getters

    //
    protected BaryObject(@Nullable BarySystem parent) {
        setParent(parent);
    }

    //
    public void setParent(@Nullable BarySystem parent) {
        this.parent = parent;
    }

    //workaround
    protected void addToParent() {
        if (this.parent != null) {
            try {
                this.parent.addObject(this);
            } catch (NullBaryObjectException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //
    public abstract double getMass();

    //
    public abstract double getRadius();
}