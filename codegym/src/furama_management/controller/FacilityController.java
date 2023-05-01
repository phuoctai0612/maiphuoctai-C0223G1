package furama_management.controller;

import furama_management.service.resorts.*;

import java.util.Scanner;

public class FacilityController {
    private static HouseServiceIplm houseServiceIplm = new HouseServiceIplm();
    private static VillaServiceIplm villaServiceIplm = new VillaServiceIplm();
    private static RoomServiceIplm roomServiceIplm = new RoomServiceIplm();
   private static FacilityServiceIplm facilityServiceIplm=new FacilityServiceIplm();
    public static void facilityMenu() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("----------------Facility Management-----------------\n" +
                    "1.\tDisplay list facility\n" +
                    "2.\tAdd new facility\n" +
                    "3.\tEdit facility\n" +
                    "4.\tReturn main menu\n" +
                    "Mời bạn lựa chọn: ");
            String check2 = sc.nextLine();
            switch (check2) {
                case "1":
                    do {
                        System.out.print("1. Display new villa\n" +
                                "2. Display new house\n" +
                                "3. Display new room\n" +
                                "4. Display all\n" +
                                "5. Return to menu\n" +
                                "Mời bạn chọn: ");
                        String choose = sc.nextLine();
                        switch (choose) {
                            case "1":
                                flag=false;
                                villaServiceIplm.disPlayList();
                                break;
                            case "2":
                                flag=false;
                                houseServiceIplm.disPlayList();
                                break;
                            case "3":
                                flag=false;
                                roomServiceIplm.disPlayList();
                                break;
                            case "4":
                                flag=false;
                                facilityServiceIplm.disPlayList();
                                break;
                                case "5":
                                facilityMenu();
                                break;

                            default:
                                System.err.println("Bạn nhập không đúng");

                        }
                    }while (flag);
                    break;
                case "2":
                    do {
                        System.out.print("1. Add new villa\n" +
                                "2. Add new house\n" +
                                "3. Add new room\n" +
                                "4. Return to menu\n" +
                                "Mời bạn chọn: ");
                        String choose = sc.nextLine();
                        switch (choose) {
                            case "1":
                                flag=false;
                                villaServiceIplm.addNewList();
                                break;
                            case "2":
                                flag=false;
                                houseServiceIplm.addNewList();
                                break;
                            case "3":
                                flag=false;
                                roomServiceIplm.addNewList();
                                break;
                            case "4":
                                facilityMenu();
                                break;
                            default:
                                System.err.println("Bạn nhập không đúng");
                        }
                    }while (flag);
                    break;
                case "3":
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn nhập không đúng");
            }
        } while (flag);
    }
}
