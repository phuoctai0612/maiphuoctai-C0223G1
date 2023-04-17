package ss12_map_tree.bai_tap.service;

import ss12_map_tree.bai_tap.model.Computer;
import ss12_map_tree.bai_tap.repository.ComputerRepositoryIplm;

import java.util.List;
import java.util.Scanner;

public class ComputerServiceIplm implements IComputerService {
    private ComputerRepositoryIplm computerRepositoryIplm = new ComputerRepositoryIplm();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayComputer() {
        List<Computer> arrayList = computerRepositoryIplm.getComputerList();
//        arrayList.sort(Comparator.comparing(Product::getGiaTien));
        for (Computer c : arrayList) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewComputer() {
        System.out.println("nhập id");
        int id = Integer.parseInt(sc.nextLine());
        int id1 = computerRepositoryIplm.checkId(id);
        System.out.println("1. PC \n" +
                "2. LapTop\n" +
                "Mời bạn chọn");
        String str = sc.nextLine();
        String sanPham;
        if (str.equals("1")) {
            sanPham = "PC";
        } else if (str.equals("2")) {
            sanPham = "LapTop";
        } else {
            System.out.println("không rõ");
            return;
        }
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá tiền");
        double giaTien = Double.parseDouble(sc.nextLine());
        Computer computer = new Computer(id1, sanPham, giaTien, name);
        computerRepositoryIplm.addNewProduct(computer);
        this.displayComputer();
    }

    @Override
    public void deleteComputer() {
        this.displayComputer();
        System.out.println("nhập id bạn muốn xóa");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Bạn có chắc muốn xóa id " + id + " này không\n" +
                "1.true\n" +
                "2. false\n" +
                "Bạn chọn đi");
        String dieuKien = sc.nextLine();
        if (dieuKien.equals("1")) {
            boolean delete = computerRepositoryIplm.deleteProduct(id);
            if (delete) {
                System.out.println("Xóa thành công");
            } else {
                System.out.println("Không có id ");
                return;
            }
        } else if (dieuKien.equals("2")) {
            System.out.println("bạn đã thoát thành công");
        } else {
            System.out.println("không có lựa chọn này");
        }
        this.displayComputer();
    }

    @Override
    public void suaComputer() {
        this.displayComputer();
        System.out.println("nhập id bạn muốn sửa");
        int id = Integer.parseInt(sc.nextLine());
        boolean suaComputer = computerRepositoryIplm.suaProduct(id);
        if (suaComputer) {
            for (int i = 0; i < computerRepositoryIplm.getComputerList().size(); i++) {
                if (id == computerRepositoryIplm.getComputerList().get(i).getId()) {
                    System.out.println("1. PC\n" +
                            "2. LapTop\n" +
                            "Mời bạn chọn");
                    String str = sc.nextLine();
                    String sanPham;
                    if (str.equals("1")) {
                        sanPham = "PC";
                    } else if (str.equals("2")) {
                        sanPham = "LapTop";
                    } else {
                        System.out.println("không rõ");
                        return;
                    }
                    computerRepositoryIplm.getComputerList().get(i).setSanPham(sanPham);
                    System.out.println("Nhập tên sản phẩm");
                    String name = sc.nextLine();
                    computerRepositoryIplm.getComputerList().get(i).setName(name);
                    System.out.println("Nhập giá tiền");
                    double giaTien = Double.parseDouble(sc.nextLine());
                    computerRepositoryIplm.getComputerList().get(i).setGiaTien(giaTien);
                    this.displayComputer();
                }
            }
        }
    }

    @Override
    public void timKiemComputer() {
        this.displayComputer();
        System.out.println("nhập tên bạn muốn tìm ");
        String name = sc.nextLine();
        int num = computerRepositoryIplm.timKiemProduct(name);
        if (num >= 0) {
            System.out.println(computerRepositoryIplm.getComputerList().get(num));
        } else {
            System.out.println("Không có tên này trong List");
        }
    }

    @Override
    public void sapXepComputer() {
        computerRepositoryIplm.sapXepProduct();
        this.displayComputer();
    }

}
