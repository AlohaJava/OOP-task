package com.company;

public class Circle extends Figure {

    private final Point center;
    private final double r;

    public Circle(Point center,double r) {
        this.center = center;
        this.r=r;
    }

    @Override
    public double getS() {
        return Math.PI*r*r;
    }

    @Override
    public double getP() {
        return 2*Math.PI*r;
    }

}
