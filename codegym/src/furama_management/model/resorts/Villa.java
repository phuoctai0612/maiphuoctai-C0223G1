package furama_management.model.resorts;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHo;
    private int soTangVilla;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, double dienTichHo, int soTangVilla) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHo = dienTichHo;
        this.soTangVilla = soTangVilla;
    }

    public Villa(String id, String name, double areaUser, double price, int maxPerson,
                 String date, String tieuChuanPhong, double dienTichHo, int soTangVilla) {
        super(id, name, areaUser, price, maxPerson, date);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHo = dienTichHo;
        this.soTangVilla = soTangVilla;
    }

    @Override
    public String toString() {
        return "Villa {" + super.toString()+
                " tieuChuanPhong= " + tieuChuanPhong + '\'' +
                ", dienTichHo= " + dienTichHo +
                ", soTangVilla= " + soTangVilla +
                '}';
    }
    public String fileVilla(){
       return super.fileFacility()+","+tieuChuanPhong+","+dienTichHo+","+soTangVilla;
    }
}
