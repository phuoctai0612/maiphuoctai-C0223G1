package furama_management.model.resorts;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String id, String name, double areaUser, double price, int maxPerson, String date, String dichVuMienPhi) {
        super(id, name, areaUser, price, maxPerson, date);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room {" + super.toString()+
                "dichVuMienPhi= " + dichVuMienPhi + '\'' +
                '}';
    }

    public String fileRoom(){
       return super.fileFacility()+","+dichVuMienPhi;
    }
}
