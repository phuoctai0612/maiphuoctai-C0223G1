package ss4_plus_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
    }

    public static class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập a");
            double a = sc.nextDouble();
            System.out.println("nhập b");
            double b = sc.nextDouble();
            System.out.println("nhập c");
            double c = sc.nextDouble();
            QuadraticEquation quadra = new QuadraticEquation(a, b, c);
            if (quadra.getDiscriminant() > 0) {
                System.out.println(quadra.getRoot1());
                System.out.println(quadra.getRoot2());
            } else if (quadra.getDiscriminant() == 0) {
                System.out.println(quadra.getRoot1());
            } else {
                System.out.println("k có nghiệm");
            }
        }
    }
}
