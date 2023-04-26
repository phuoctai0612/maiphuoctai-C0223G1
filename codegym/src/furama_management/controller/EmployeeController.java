package furama_management.controller;

import furama_management.service.person.EmployeeServiceIplm;

import java.util.Scanner;

public class EmployeeController {

    public static void employeeMenu(){
        EmployeeServiceIplm employeeServiceIplm=new EmployeeServiceIplm();
        Scanner sc=new Scanner(System.in);
        boolean flag1=true;
        do {
            System.out.println("----------------------Employee Management----------------------\n" +
                    "1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n" +
                    "Mời bạn lựa chọn");
            String check1 = sc.nextLine();
            switch (check1) {
                case "1":
                    employeeServiceIplm.disPlayList();
                    break;
                case "2":
                    employeeServiceIplm.addNewList();
                    break;
                case "3":
                    employeeServiceIplm.editList();
                    break;
                case "4":
                    flag1=false;
                    break;
                default:
                    System.err.println("Bạn nhập không đúng");
                    employeeMenu();
            }
        }while (flag1);
    }
}
