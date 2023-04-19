package ss14_thuat_toan_sap_xep.bai_tap_them.controller;

import ss14_thuat_toan_sap_xep.bai_tap_them.service.SpendServiceIplm;

import java.util.Scanner;

public class SpendController {
   static SpendServiceIplm spendServiceIplm = new SpendServiceIplm();
   static Scanner sc = new Scanner(System.in);

    public void showListSpend() {
        boolean flag=true;
        do {
            System.out.println("----------------Quản lý công việc---------------\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm danh sách\n" +
                    "3. Xóa danh sách\n" +
                    "4. Sửa danh sách\n" +
                    "5. Tìm kiếm theo mã\n" +
                    "6. Tìm kiếm theo tên\n" +
                    "0. Thoát\n" +
                    "Mời bạn chọn");
                String str= sc.nextLine();
                switch (str){
                    case "1":
                        spendServiceIplm.displaySpendService();
                        break;
                    case "2":
                        spendServiceIplm.addNewListSpend();
                        break;
                    case "3":
                        spendServiceIplm.deleteListSpend();
                        break;
                    case "4":
                        spendServiceIplm.editListSpend();
                        break;
                    case "5":
                        spendServiceIplm.findListSpend();
                        break;
                    case "6":
                        spendServiceIplm.findStringListSpend();
                        break;
                    case "0":
                        flag=false;
                        break;
                    default:
                        System.out.println("Thông tin bạn nhập không khớp với chương trình");

                }
        }while (flag);
    }
}
