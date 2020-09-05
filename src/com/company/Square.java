package com.company;

public class Square extends Rect {
    public Square(Point letfUpCorner, Point rightDownCorner) {
        super(letfUpCorner, rightDownCorner);
    }

    @Override
    public double getS() {
        return Math.pow(getH(),2);
    }

    @Override
    public double getP() {
        return 4*getH();
    }

}
