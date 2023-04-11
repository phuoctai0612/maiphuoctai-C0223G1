package ss6_inheritance.bai_tap.point2d;

import java.util.Arrays;

public class Management {
    public static void main(String[] args) {
        Point2D p2 = new Point2D();
        Point3D p3 = new Point3D();
        p2.setX(3.4f);
        p2.setY(6.5f);
        System.out.println(p2.toString());
        p2.setXY(3f, 7f);
        System.out.println(p2.toString());
        System.out.println(Arrays.toString(p2.getXY()));
        p3.setXY(5f,6f);
        p3.setZ(10f);
        System.out.println(p3.toString());
        p3.setXYZ(6f, 7f, 8f);
        System.out.println(p3.toString());
        System.out.println(Arrays.toString(p3.getXYZ()));
    }
}
