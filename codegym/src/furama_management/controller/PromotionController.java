package furama_management.controller;

import java.util.Scanner;

public class PromotionController {

    public static void promotionMenu(){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("----------------Promotion Management-----------------\n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n" +
                    "Mời bạn lựa chọn");
            String check4 = sc.nextLine();
            switch (check4) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    flag=false;
                    break;
                default:
                    System.out.println("Bạn nhập không đúng");
            }
        }while (flag);
    }
}
