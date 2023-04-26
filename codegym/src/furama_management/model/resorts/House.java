package furama_management.model.resorts;

public class House extends Facility {
    private String tieuChuan;
    private int soTangHouse;

    public House() {
    }

    public House(String tieuChuan, int soTang) {
        this.tieuChuan = tieuChuan;
        this.soTangHouse = soTang;
    }

    public House(int id, String name, double areaUser, double price, int maxPerson, String date, String tieuChuan, int soTang) {
        super(id, name, areaUser, price, maxPerson, date);
        this.tieuChuan = tieuChuan;
        this.soTangHouse = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public int getSoTang() {
        return soTangHouse;
    }

    public void setSoTang(int soTang) {
        this.soTangHouse = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuan='" + tieuChuan + '\'' +
                ", soTang=" + soTangHouse +
                '}';
    }
}
