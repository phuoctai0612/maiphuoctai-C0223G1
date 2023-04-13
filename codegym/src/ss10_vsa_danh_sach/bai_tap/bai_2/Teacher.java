package ss10_vsa_danh_sach.bai_tap.bai_2;

public class Teacher extends Person{
    private String chuyenMon;

    public Teacher() {
    }

    public Teacher(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public Teacher(String ma, String ten, String date, boolean gioiTinh, String chuyenMon) {
        super(ma, ten, date, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
}
