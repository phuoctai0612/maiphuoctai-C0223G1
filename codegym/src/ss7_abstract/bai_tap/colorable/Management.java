package ss7_abstract.bai_tap.colorable;

public class Management {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Square(3);
        s[1] = new Circle(5);
        s[2] = new Rectangle(6, 4);
        for (Shape a : s
        ) {
            if (a instanceof Square) {
                System.out.println(((Square) a).howToColor());
                System.out.println(" Area of Square: " +((Square) a).getArea());
            } else if (a instanceof Circle){
                System.out.println(" Area of Circle: " +((Circle) a).getArea());
            }else if (a instanceof Rectangle){
                System.out.println(" Area of Rectangle: " +((Rectangle) a).getArea());
            }
        }
    }
}
