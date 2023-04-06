package ss4_plus_class_object.fan;

public class FanManagement {
    public static void main(String[] args) {
        Fan fan1 = new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.getColor();
        fan2.isOn();
        System.out.println("đang bật "+fan1.toString());
        System.out.println("tắt "+fan2.toString());
    }

}
