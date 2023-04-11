package ss7_abstract.bai_tap.resizeable;

import java.util.Arrays;

public class Management {
    public static void main(String[] args) {

        Shape[] sh = new Shape[3];
        sh[0] = new Circle(5);
        sh[1] = new Rectangle(4, 5);
        sh[2] = new Square(4);
        for (Shape a : sh
        ) {
            if (a instanceof Circle) {
                System.out.println("Area old: " + ((Circle) a).toString());
                a.resize(Math.floor(Math.random() * 100));
                System.out.println("Area new: " + ((Circle) a).toString());
            } else if (a instanceof Rectangle) {
                System.out.println("Area old: " + ((Rectangle) a).toString());
                a.resize(Math.floor(Math.random() * 100));
                System.out.println("Area new: " + ((Rectangle) a).toString());
            } else if (a instanceof Square) {
                System.out.println("Area old: " + ((Square) a).toString());
                a.resize(Math.floor(Math.random() * 100));
                System.out.println("Area new: " + ((Square) a).toString());
            }
        }
    }
}
