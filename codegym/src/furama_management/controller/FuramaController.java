package furama_management.controller;

import furama_management.service.BookingServiceIplm;
import furama_management.service.ContractServiceIplm;
import furama_management.service.person.CustomerServiceIplm;
import furama_management.service.person.EmployeeServiceIplm;
import furama_management.service.resorts.FacilityServiceIplm;
import furama_management.service.resorts.HouseServiceIplm;
import furama_management.service.resorts.RoomServiceIplm;
import furama_management.service.resorts.VillaServiceIplm;

import java.util.Scanner;

public class FuramaController {

    public static final String ANSI_RED = "\u001B[31m";
    EmployeeServiceIplm employeeServiceIplm = new EmployeeServiceIplm();
    CustomerServiceIplm customerServiceIplm = new CustomerServiceIplm();
    FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();
    HouseServiceIplm houseServiceIplm = new HouseServiceIplm();
    VillaServiceIplm villaServiceIplm = new VillaServiceIplm();
    RoomServiceIplm roomServiceIplm = new RoomServiceIplm();
    BookingServiceIplm bookingServiceIplm = new BookingServiceIplm();
    ContractServiceIplm contractServiceIplm = new ContractServiceIplm();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;

    public static void disPlayMainMenu() {

        do {

            String check;
            System.out.println("-------------------Quản lý khu resorts Furuma------------------\n" +
                    "1.\tEmployee Management \n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6. Exit\n" +
                    "Mời bạn lựa chọn");
            int check1 = 0;
            try {
                check1 = Integer.parseInt(sc.nextLine());
                if (check1 > 0 && check1 < 6) {
                    System.out.println("Vào thành công");
                } else {
                    System.out.println(ANSI_RED + "Mời bạn nhập đúng chương trình" + ANSI_RED);
                }
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED + "Mời bạn nhập đúng chương trình" + ANSI_RED);
            } catch (Exception e) {
                System.out.println(ANSI_RED + "Mời bạn nhập đúng chương trình" + ANSI_RED);
            }
            check = String.valueOf(check1);
            switch (check) {
                case "1":
                    EmployeeController.employeeMenu();
                    break;
                case "2":
                    CustomerController.customerMenu();
                    break;
                case "3":
                    FacilityController.facilityMenu();
                    break;
                case "4":
                    BookingController.bookingMenu();
                    break;
                case "5":
                    PromotionController.promotionMenu();
                    break;
                case "6":
                    System.out.println("Bạn đã thoát thành công");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
