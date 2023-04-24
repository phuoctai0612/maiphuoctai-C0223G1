package ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private double gia;
    private String hangSanXuat;

    public Product() {
    }

    public Product(String id, String name, double gia, String hangSanXuat) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gia=" + gia +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                '}';
    }
}
