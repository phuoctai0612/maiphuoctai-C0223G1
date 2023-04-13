package ss10_vsa_danh_sach.bai_tap.bai_2;

import java.util.ArrayList;

public class Student extends Person {
    private String lop;
    private double diemSo;

    public Student() {
    }

    public Student(String lop, double diemSo) {
        this.lop = lop;
        this.diemSo = diemSo;
    }

    public Student(String ma, String ten, String date, boolean gioiTinh, String lop, double diemSo) {
        super(ma, ten, date, gioiTinh);
        this.lop = lop;
        this.diemSo = diemSo;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }

}
