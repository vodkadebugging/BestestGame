package data;

import bary.*;

//
public class Data {
    private BaryObject root;

    //
    public Data(BaryObject root) {
        setRoot(root);
    }

    //
    public BaryObject getRoot() {
        return root;
    }

    //
    public void setRoot(BaryObject root) {
        this.root = root;
    }
}