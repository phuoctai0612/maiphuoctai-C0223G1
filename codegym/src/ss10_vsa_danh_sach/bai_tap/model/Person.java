package ss10_vsa_danh_sach.bai_tap.model;

public class Person {
    private String ma;
    private String ten;
    private String Date;
    private boolean gioiTinh;
    public Person() {
    }

    public Person(String ma, String ten, String date, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        Date = date;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
