package furama_management.model.person;

public class Employee extends Person {
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(String trinhDo, String viTri, double luong) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String ma, String ten, String ngaySinh, String gioiTinh,
                    String soCMND, String soDienThoai, String email, String trinhDo, String viTri, double luong) {
        super(ma, ten, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

    public String luuFile() {
        return super.luuFilePerson() + "," + trinhDo + "," + viTri + "," + luong;
    }
}
