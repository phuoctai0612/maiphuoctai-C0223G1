package ss12_map_tree.bai_tap.repository;

import ss12_map_tree.bai_tap.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerRepositoryIplm implements IComputerRepository {
    public static ArrayList<Computer> computerArrayList = new ArrayList<>();

    static {
        computerArrayList.add(new Computer(1, "PC", 5000, "Lenovo"));
        computerArrayList.add(new Computer(2, "PC", 6000, "ASUS"));
        computerArrayList.add(new Computer(3, "LapTop", 20000, "Mac"));
        computerArrayList.add(new Computer(4, "LapTop", 7000, "Predator"));
    }

    @Override
    public int checkId(int id) {
        for (int i = 0; i < id; i++) {
            if (id == computerArrayList.get(i).getId()) {
                return id = computerArrayList.size() + 1;
            } else {
                return id;
            }
        }
        return id = computerArrayList.size();
    }

    @Override
    public List<Computer> getComputerList() {
        return computerArrayList;
    }

    @Override
    public void addNewProduct(Computer computer) {
        computerArrayList.add(computer);
    }


    @Override
    public boolean deleteProduct(int id) {
        for (int i = 0; i < id; i++) {
            if (computerArrayList.get(i).getId() == id) {
                computerArrayList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean suaProduct(int id) {
        for (int i = 0; i < id; i++) {
            if (computerArrayList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int timKiemProduct(String a) {
        for (int i = 0; i < computerArrayList.size(); i++) {
            if (computerArrayList.get(i).getName().equals(a)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXepProduct() {
        computerArrayList.sort((o1, o2) -> (int) (o1.getGiaTien() - o2.getGiaTien()));
//        computerArrayList.sort((o1, o2) -> (int) (o2.getGiaTien() - o1.getGiaTien()));
    }
}
