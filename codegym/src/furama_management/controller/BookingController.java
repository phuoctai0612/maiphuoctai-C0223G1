package furama_management.controller;

import java.util.Scanner;

public class BookingController {
    public static void bookingMenu(){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("----------------Booking Management-----------------\n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n" +
                    "Mời bạn lựa chọn");
            String check3 = sc.nextLine();
            switch (check3) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    flag=false;
                    break;
                default:
                    System.out.println("Bạn nhập không đúng");
            }
        }while (flag);
    }
}
