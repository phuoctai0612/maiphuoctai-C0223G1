package ss14_thuat_toan_sap_xep.bai_tap_them.model;

public class Spend {
    private String id;
    private String name;
    private String day;
    private double money;

    public Spend() {
    }

    public Spend(String id, String name, String day, double money) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Spend{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", money=" + money +
                '}';
    }
}

