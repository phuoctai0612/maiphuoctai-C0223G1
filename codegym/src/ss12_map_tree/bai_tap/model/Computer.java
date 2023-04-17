package ss12_map_tree.bai_tap.model;

import java.util.Comparator;

public class Computer extends Product {
    private String name;

    public Computer() {
    }

    public Computer(int id, String sanPham, double giaTien, String name) {
        super(id, sanPham, giaTien);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' + " " + super.toString() +
                '}';
    }
}
