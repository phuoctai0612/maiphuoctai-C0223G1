package ss7_abstract.bai_tap.colorable;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public Square(String color, boolean filled, double a) {
        super(color, filled);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {
        return getA() * getA();
    }


    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}' + " Area of Square " + getArea();
    }

    @Override
    public String howToColor() {
        return getColor()+" "+"Color all four sides";
    }
}
