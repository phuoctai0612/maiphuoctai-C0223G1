package ss5_accessmodifier.ThucPham;

public class ThucPham {
    public int maHang;
    public String tenHang;
    public int nsx;
    public int nhh;
    public double donGia;
    public ThucPham(int maHang) {
        this.maHang = maHang;
    }

    public ThucPham(int maHang, String tenHang, int nsx, int nhh ,double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nsx = nsx;
        this.nhh = nhh;
        this.donGia=donGia;
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;

    }

    public int getNsx() {
        return nsx;
    }

    public void setNsx(int nsx) {
        this.nsx = nsx;
    }

    public int getNhh() {
        return nhh;
    }

    public void setNhh(int nhh) {
        this.nhh = nhh;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int kiemTra(){
        return this.nhh-this.nsx;
    }

    @Override
    public String toString() {
        return "ThucPham{" +
                "maHang=" + maHang +
                ", tenHang='" + tenHang + '\'' +
                ", nsx=" + nsx +
                ", nhh=" + nhh +
                ", donGia=" + donGia +
                '}';
    }
}
