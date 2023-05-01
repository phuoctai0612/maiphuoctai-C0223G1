package furama_management.service.resorts;

import furama_management.model.resorts.Facility;
import furama_management.model.resorts.House;
import furama_management.model.resorts.Room;
import furama_management.repository.resorts.FacilityRepositoryIplm;
import furama_management.repository.resorts.RoomRepositoryIplm;
import furama_management.service.IService;
import furama_management.util.Validate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomServiceIplm implements IService {
    RoomRepositoryIplm roomRepositoryIplm = new RoomRepositoryIplm();
    Validate validate = new Validate();
    Scanner sc = new Scanner(System.in);

    @Override
    public void disPlayList() {
        LinkedHashMap<Room, Integer> roomIntegerMap = roomRepositoryIplm.showList();
        for (Room r : roomIntegerMap.keySet()) {
            System.out.println(r);
        }
    }

    @Override
    public void addNewList() {
        boolean flag = true;
        String id;

        do {
            System.out.print("Nhập id: ");
            id = sc.nextLine();
            if (validate.regexIdRoom(id)) {
                System.out.println("Nhập id thành công");
            } else {
                System.err.println("Bạn nhập sai định dạng RO-XXXX");
            }
        } while (!validate.regexIdRoom(id));
        String name;
        do {
            System.out.print("Nhập tên: ");
            name = sc.nextLine();
            if (validate.regexTenDichVu(name)) {
                System.out.println("Nhập tên thành công");
            } else {
                System.err.println("Bạn nhập sai định dạng viết hoa chữ cái đầu");
            }
        } while (!validate.regexTenDichVu(name));
        double area;
        do {
            System.out.print("Nhập diện tích sử dụng (mét vuông): ");
            area = Double.parseDouble(sc.nextLine());
            if (area >= 30) {
                System.out.println("Nhập diện tích thành công");
            } else {
                System.err.println("Diện tích không thể dưới 30 hoặc khác số");
            }
        } while (area < 30);

        double price = 0;
        do {
            System.out.print("Nhập chi phí thuê phòng: ");
            price = Double.parseDouble(sc.nextLine());
            if (price > 0) {
                System.out.println("Nhập chi phí thành công");
            } else {
                System.err.println("Không nhập dưới 0 và kí tự khác");
            }
        } while (price < 0);
        int maxPerson;
        do {
            System.out.print("Nhập số lượng người tối đa: ");
            maxPerson = Integer.parseInt(sc.nextLine());
            if (maxPerson < 20 && maxPerson > 0) {
                System.out.println("Thêm thành công");
            } else {
                System.err.println("Số người tối đa là 20 và nhỏ nhất là 0");
            }

        } while (maxPerson > 20 || maxPerson < 0);
        String date1;
        String date = null;
        boolean flag1 = true;
        int check;
        boolean flag2;
        do {
            flag2 = true;
            System.out.print("Bạn muốn kiểu thuê nào\n" +
                    "1. Thuê theo năm\n" +
                    "2. Thuê theo tháng\n" +
                    "3. Thuê theo ngày\n" +
                    "4. Thuê theo giờ\n" +
                    "Mời bạn chọn: ");
            date1 = sc.nextLine();
            switch (date1) {
                case "1":
                    do {
                        System.out.printf("Bạn muốn thuê mấy năm: ");
                        check = Integer.parseInt(sc.nextLine());
                        try {
                            if (check > 0) {
                                System.out.println("Bạn thuê thành công " + check + " năm");
                                date = String.valueOf(check) + " năm";
                                flag1 = false;
                                flag2 = false;
                            } else {
                                System.err.println("Số năm cần lớn hơn 0 và là 1 con số");
                            }
                        } catch (Exception e) {
                            System.err.println("Bạn nhập sai mời bạn nhập lại");
                        }
                    } while (flag1);
                    break;
                case "2":
                    do {
                        System.out.print("Bạn muôn thuê mấy tháng");
                        check = Integer.parseInt(sc.nextLine());
                        try {
                            if (check > 0 && check < 12) {
                                System.out.println("Bạn thuê thành công " + check + " tháng");
                                date = check + " tháng";
                                flag1 = false;
                                flag2 = false;
                            } else {
                                System.err.println("Bạn cần nhập từ 1 tháng đến 12 tháng");
                            }
                        } catch (Exception e) {
                            System.err.println("Bạn nhập sai mời bạn nhập lại");
                        }
                    } while (flag1);
                    break;
                case "3":
                    do {
                        System.out.print("Bạn muôn thuê mấy ngày");
                        check = Integer.parseInt(sc.nextLine());
                        try {
                            if (check > 0 && check < 31) {
                                System.out.println("Bạn thuê thành công " + check + " ngày");
                                date = String.valueOf(check + " ngày");
                                flag1 = false;
                                flag2 = false;
                            } else {
                                System.err.println("Bạn cần nhập từ 1 tháng đến 31 ngày");
                            }
                        } catch (Exception e) {
                            System.err.println("Bạn nhập sai mời bạn nhập lại");
                        }
                    } while (flag1);
                    break;
                case "4":
                    do {
                        System.out.print("Bạn muôn thuê mấy giờ");
                        check = Integer.parseInt(sc.nextLine());
                        try {
                            if (check > 0 && check < 31) {
                                System.out.println("Bạn thuê thành công " + check + " giờ");
                                date = check + " giờ";
                                flag1 = false;
                                flag2 = false;
                            } else {
                                System.err.println("Bạn cần nhập từ 1 tháng đến 24 giờ");
                            }
                        } catch (Exception e) {
                            System.err.println("Bạn nhập sai mời bạn nhập lại");
                        }
                    } while (flag1);
                    break;
            }
        } while (flag2);
        System.out.print("Mời bạn nhập dịch vụ miễn phí");
        String dichVuMienPhi = sc.nextLine();
        Room room = new Room(id, name, area, price, maxPerson, date, dichVuMienPhi);
        roomRepositoryIplm.addList(room);
    }


}
