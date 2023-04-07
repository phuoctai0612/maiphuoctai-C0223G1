package ss5_accessmodifier.TestCircle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.toString() + c.getArea());
    }
}
