package ss12_map_tree.bai_tap.model;

public class Product {
    private int id;
    private String sanPham;
    private double giaTien;

    public Product() {
    }

    public Product(int id, String sanPham, double giaTien) {
        this.id = id;
        this.sanPham = sanPham;
        this.giaTien = giaTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", sanPham='" + sanPham + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
}
