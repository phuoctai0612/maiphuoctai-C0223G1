package furama_management.controller;

import furama_management.service.person.CustomerServiceIplm;

import java.util.Scanner;

public class CustomerController {
    public static void customerMenu(){
        CustomerServiceIplm customerServiceIplm=new CustomerServiceIplm();
        Scanner sc=new Scanner(System.in);
        boolean flag =true;
        do {
            System.out.print("------------------------Customer Management-------------------------- \n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n" +
                    "Mời bạn lựa chọn: ");
            String check2 = sc.nextLine();
            switch (check2) {
                case "1":
                    customerServiceIplm.disPlayList();
                    break;
                case "2":
                    customerServiceIplm.addNewList();
                    break;
                case "3":
                    customerServiceIplm.editList();
                    break;
                case "4":
                     flag=false;
                    break;
                default:
                    System.out.println("Bạn nhập không đúng");
                    customerMenu();
            }
        }while (flag);
    }
}
