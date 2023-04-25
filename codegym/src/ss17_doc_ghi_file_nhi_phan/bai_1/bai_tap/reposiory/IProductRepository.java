package ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.reposiory;

import ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showProduct();

    void addNewProduct(Product product);

    List<Product> findProduct(String name);
    void deleteProduct(String id);
}
