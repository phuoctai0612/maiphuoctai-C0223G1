package ss14_thuat_toan_sap_xep.bai_tap_them.view;

import ss14_thuat_toan_sap_xep.bai_tap_them.controller.SpendController;

public class SpendManagement {
    public static void main(String[] args) {
        SpendController spendController=new SpendController();
        spendController.showListSpend();
    }
}
