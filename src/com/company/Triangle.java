package com.company;

public class Triangle extends Figure {
    private final Point A,B,C;
    private double ab,ac,bc;
    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
        ab=a.distanceTo(b);
        ac=a.distanceTo(c);
        bc=b.distanceTo(c);
    }


    @Override
    public double getS() {
        double p=getP()/2;
        return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
    }

    @Override
    public double getP() {
        return ab+ac+bc;
    }
}
