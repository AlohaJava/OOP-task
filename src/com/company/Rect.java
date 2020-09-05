package com.company;

public class Rect extends Figure {

    private final Point letfUpCorner, rightDownCorner;

    public Rect(Point letfUpCorner, Point rightDownCorner) {
        this.letfUpCorner = letfUpCorner;
        this.rightDownCorner=rightDownCorner;
    }

    public double getH(){
        return letfUpCorner.getY()-rightDownCorner.getY();
    }

    public double getW(){
        return rightDownCorner.getX()-letfUpCorner.getX();
    }

    @Override
    public double getS() {
        return getH()*getW();
    }

    @Override
    public double getP() {
        return 2*(getH()+getW());
    }
}
