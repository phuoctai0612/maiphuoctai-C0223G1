package ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.reposiory;

import ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.common.ReadAndWrite;
import ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    Scanner sc = new Scanner(System.in);
    //public Product(String id, String name, double gia, String hangSanXuat) {
    List<Product> list = new ArrayList<>();

    @Override
    public List<Product> showProduct() {
        list.clear();
        Product product = new Product("1", "Tài", 1000000000, "Bé Thông");
        Product product1 = new Product("2", "Bánh Coriel", 20000, "Coriel");
        Product product2 = new Product("3", "Kẹo Đồng", 10000000, "Mafia");
        list.add(product);
        list.add(product1);
        list.add(product2);
        ReadAndWrite.writeFile(list);
        return ReadAndWrite.readFile();
    }

    @Override
    public void addNewProduct(Product product) {
        list.add(product);
        ReadAndWrite.writeFile(list);
    }

    @Override
    public List<Product> findProduct(String name) {
        List<Product> list1 = new ArrayList<>();
        for (Product e : list) {
            if (e.getName().contains(name)) {
                list1.add(e);
            }
        }
        return list1;
    }
}
