package ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.common;

import ss17_doc_ghi_file_nhi_phan.bai_1.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String PART_SOURCE_FILE = "codegym/src/ss17_doc_ghi_file_nhi_phan/bai_1/bai_tap/file1/product.csv";

    public static List<Product> readFile() {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PART_SOURCE_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void writeFile(List<Product> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PART_SOURCE_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
