package furama_management.model;

public class Booking {
    private int maBooking;
    private int ngayBatDau;
    private int ngayKetThuc;
    private String maKhachHang;
    private String maDichVu;

    public Booking(int maBooking, int ngayBatDau, int ngayKetThuc, String maKhachHang, String maDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public int getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(int ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(int ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking=" + maBooking +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                '}';
    }
}
