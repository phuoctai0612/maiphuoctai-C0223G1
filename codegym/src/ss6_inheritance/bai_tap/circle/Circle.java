package ss6_inheritance.bai_tap.circle;

public class Circle {
    private int d;
    private String color;

    public Circle() {
    }

    public Circle(int d, String color) {
        this.d = d;
        this.color = color;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "d=" + d +
                ", color='" + color + '\'' +
                '}';
    }
}
