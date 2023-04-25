package ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.service;

import ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.model.Product;
import ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.reposiory.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    ProductRepository productRepository = new ProductRepository();

    @Override
    public void showProduct() {
        List<Product> list = productRepository.showProduct();
        for (Product a : list) {
            System.out.println(a);
        }
    }

    @Override
    public void findProduct() {
        System.out.println("Nhập tên bạn muốn tìm");
        String name = sc.nextLine();
        List<Product> productList = productRepository.findProduct(name);
        if (productList.size() == 0) {
            System.out.println("Không tìm thấy tên");
        } else {
            for (Product a : productList) {
                System.out.println(a);
            }
        }
    }

    @Override
    public void addNewProduct() {
        System.out.println("Nhập mã sản phẩm");
        String id = sc.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String hangSanXuat = sc.nextLine();
        Product product = new Product(id, name, gia, hangSanXuat);
        productRepository.addNewProduct(product);
    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhap id");
        String id=sc.nextLine();
        productRepository.deleteProduct(id);
    }
}
