package furama_management.model.person;



public class Customer extends Person {
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String loaiKhach, String diaChi) {
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String ma, String ten, String ngaySinh, String gioiTinh,
                    String soCMND, String soDienThoai, String email, String loaiKhach, String diaChi) {
        super(ma, ten, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+" "+
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public String luuFileCustomer() {
        return super.luuFilePerson() + "," + loaiKhach + "," + diaChi;
    }
}
