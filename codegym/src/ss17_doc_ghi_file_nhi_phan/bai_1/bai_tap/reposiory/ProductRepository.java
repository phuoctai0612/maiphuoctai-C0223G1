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

    @Override
    public void deleteProduct(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                list.remove(i);
            }
        }
        ReadAndWrite.readFile();
        ReadAndWrite.writeFile(list);
    }
}
