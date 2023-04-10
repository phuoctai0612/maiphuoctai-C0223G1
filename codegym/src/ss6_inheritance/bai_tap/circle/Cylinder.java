package ss6_inheritance.bai_tap.circle;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(int d, String color, double height) {
        super(d, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double theTich() {
        return 2 * Math.PI * getHeight() * this.getD();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
