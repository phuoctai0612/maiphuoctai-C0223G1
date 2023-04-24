package ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.view;

import ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.controller.ProductController;

public class ProductManagement {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        controller.showMenu();
    }
}
