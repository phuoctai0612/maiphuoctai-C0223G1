package ss12_map_tree.bai_tap.repository;

import ss12_map_tree.bai_tap.model.Computer;

import java.util.List;

public interface IComputerRepository {
    int checkId(int id);

    List<Computer> getComputerList();

    void addNewProduct(Computer computer);

    boolean deleteProduct(int id);

    boolean suaProduct(int id);

    int timKiemProduct(String a);

    void sapXepProduct();
}
