package ss5_accessmodifier.thuc_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfcars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfcars++;
    }
}
