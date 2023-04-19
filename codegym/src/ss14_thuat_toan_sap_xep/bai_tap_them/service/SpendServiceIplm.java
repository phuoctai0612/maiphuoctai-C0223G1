package ss14_thuat_toan_sap_xep.bai_tap_them.service;

import ss14_thuat_toan_sap_xep.bai_tap_them.model.Spend;
import ss14_thuat_toan_sap_xep.bai_tap_them.repository.SpendRepositoryIplm;

import java.util.List;
import java.util.Scanner;

public class SpendServiceIplm implements ISpendService {
    Scanner sc = new Scanner(System.in);
    SpendRepositoryIplm spendRepositoryIplm = new SpendRepositoryIplm();

    @Override
    public void displaySpendService() {
        List<Spend> spendList = spendRepositoryIplm.showListSpend();
        for (Spend spend : spendList) {
            System.out.println(spend);
        }
    }

    @Override
    public void addNewListSpend() {
        System.out.println("Nhập mã");
        String id = sc.nextLine();
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày chi");
        String day = sc.nextLine();
        System.out.println("Nhập số tiền chi");
        double money = Double.parseDouble(sc.nextLine());
        Spend spend = new Spend(id, name, day, money);
        spendRepositoryIplm.addNewListSpend(spend);
        this.displaySpendService();
    }

    @Override
    public void deleteListSpend() {
        this.displaySpendService();
        System.out.println("Nhập mã bạn muốn xóa");
        String id = sc.nextLine();
        boolean check = spendRepositoryIplm.deleteListSpend(id);
        if (check) {
            System.out.println("Bạn xóa thành công");
        } else {
            System.out.println("Không có mã này");
        }
    }

    @Override
    public void editListSpend() {
        this.displaySpendService();
        System.out.println("Nhập id bạn muốn sửa");
        String id = sc.nextLine();
        boolean check = spendRepositoryIplm.editListSpend(id);
        if (check) {
            System.out.println("Nhập tên bạn muốn sửa");
            String name = sc.nextLine();
            System.out.println("Nhập ngày chi");
            String day = sc.nextLine();
            System.out.println("Nhập số tiền chi");
            double money = Double.parseDouble(sc.nextLine());
            Spend spend = new Spend(id, name, day, money);
            spendRepositoryIplm.addNewListSpend(spend);
            this.displaySpendService();
        } else {
            System.out.println("Không có mã này");
        }
    }

    @Override
    public void findListSpend() {
        System.out.println("Nhập mã bạn muốn tìm");
        String id = sc.nextLine();
        if (spendRepositoryIplm.findListSpend(id) >= 0) {
            System.out.println(spendRepositoryIplm.showListSpend().get(spendRepositoryIplm.findListSpend(id)));
        } else {
            System.out.println("Không có mã này trong List");
        }
    }

    @Override
    public void findStringListSpend() {
        System.out.println("Nhập tên bạn muốn tìm");
        String name = sc.nextLine();
        int check = spendRepositoryIplm.findStringListSpend(name);
        if (check >= 0) {
            System.out.println(spendRepositoryIplm.showListSpend().get(spendRepositoryIplm.findStringListSpend(name)));
        } else {
            System.out.println("Không có tên này trong danh sách");
        }
    }
}
