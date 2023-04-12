package ss7_abstract.bai_tap.resizeable;

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
    public void resize(double percent) {
        double size = 1 + percent / 100;
        setA(size * getA());
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}' + " --Area Square: " + getArea();
    }
}
