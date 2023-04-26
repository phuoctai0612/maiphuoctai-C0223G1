package furama_management.model.resorts;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(int id, String name, double areaUser, double price, int maxPerson, String date, String dichVuMienPhi) {
        super(id, name, areaUser, price, maxPerson, date);
        this.dichVuMienPhi = dichVuMienPhi;
    }
}
