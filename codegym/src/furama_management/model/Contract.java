package furama_management.model;

public class Contract {
    private String soHopDong;
    private int maBooking;
    private double tienCocTruoc;
    private double tongTien;

    public Contract(String soHopDong, int maBooking, double tienCocTruoc, double tongTien) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.tienCocTruoc = tienCocTruoc;
        this.tongTien = tongTien;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public double getTienCocTruoc() {
        return tienCocTruoc;
    }

    public void setTienCocTruoc(double tienCocTruoc) {
        this.tienCocTruoc = tienCocTruoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking=" + maBooking +
                ", tienCocTruoc=" + tienCocTruoc +
                ", tongTien=" + tongTien +
                '}';
    }
}
