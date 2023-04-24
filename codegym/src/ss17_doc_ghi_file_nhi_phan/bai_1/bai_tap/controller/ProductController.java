package ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.controller;

import ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.service.ProductService;

import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        boolean flag = true;
        do {
            System.out.println("-----------------Quản lí sản phẩm---------------------\n" +
                    "1. Hiển thị sản phẩm\n" +
                    "2. Tìm kiếm sản phẩm\n" +
                    "3. Thêm sản phẩm\n" +
                    "Mời bạn chọn");
            String str = sc.nextLine();
            switch (str) {
                case "1":
                    productService.showProduct();
                    break;
                case "2":
                    productService.findProduct();
                    break;
                case "3":
                    productService.addNewProduct();
                    break;
                default:
                    System.out.println("Không tồn tại");
                    showMenu();
            }
        } while (flag);
    }
}
