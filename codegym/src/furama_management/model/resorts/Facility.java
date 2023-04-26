package furama_management.model.resorts;

public abstract class Facility {
    private int id;
    private String name;
    private double areaUser;
    private double price;
    private int maxPerson;
    private String date;

    public Facility() {
    }

    public Facility(int id, String name, double areaUser, double price, int maxPerson, String date) {
        this.id = id;
        this.name = name;
        this.areaUser = areaUser;
        this.price = price;
        this.maxPerson = maxPerson;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(double areaUser) {
        this.areaUser = areaUser;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Furuma{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", areaUser=" + areaUser +
                ", price=" + price +
                ", maxPerson=" + maxPerson +
                ", date='" + date + '\'' +
                '}';
    }
}
