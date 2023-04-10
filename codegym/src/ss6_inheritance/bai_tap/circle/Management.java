package ss6_inheritance.bai_tap.circle;

public class Management {
    public static void main(String[] args) {
        Circle c = new Circle(6, "blue");
        Cylinder c1 = new Cylinder(6, "yellow", 6);
        System.out.println(c1.theTich());
        System.out.println(c.toString());
        System.out.println(c1.toString());
    }
}
