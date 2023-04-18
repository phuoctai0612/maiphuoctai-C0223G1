package ss12_map_tree.bai_tap.controller;

import ss12_map_tree.bai_tap.service.ComputerServiceIplm;

import java.util.Scanner;

public class ProductController {
    private ComputerServiceIplm computerServiceIplm = new ComputerServiceIplm();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;

    public void showProduct() {
        do {


            System.out.println("-----------------Quản lý sản phẩm-----------------\n" +
                    "1. Hiển thị sản phẩm\n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Sửa sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm\n" +
                    "6. Sắp xếp sản phẩm\n" +
                    "0. Out\n" +
                    "Mời bạn chọn");
            String str = sc.nextLine();
            switch (str) {
                case "1":
                    computerServiceIplm.displayComputer();
                    break;
                case "2":
                    computerServiceIplm.addNewComputer();
                    break;
                case "3":
                    computerServiceIplm.deleteComputer();
                    break;
                case "4":
                    computerServiceIplm.suaComputer();
                    break;
                case "5":
                    computerServiceIplm.timKiemComputer();
                    break;
                case "6":
                    computerServiceIplm.sapXepComputer();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Bạn thoát thành công");
                    break;
                default:
                    System.out.println("Bạn nhập chưa đúng");
            }
        } while (flag);
    }
}
