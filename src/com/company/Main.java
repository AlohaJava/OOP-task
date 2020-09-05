package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Point a=new Point(0,0);
        Point b=new Point(0,1);
        Point c=new Point(1,1);
        Point d=new Point(1,0);
        Figure[] figures = {new Circle(a,1), new Rect(b,d),new Square(b,d),new Triangle(a,b,d)};
        Arrays.stream(figures).forEach(el->System.out.println("P="+el.getP()+", S="+el.getS()));
    }
}
