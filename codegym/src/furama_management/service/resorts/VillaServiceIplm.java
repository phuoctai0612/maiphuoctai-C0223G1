package furama_management.service.resorts;

import furama_management.model.resorts.Facility;
import furama_management.model.resorts.House;
import furama_management.model.resorts.Villa;
import furama_management.repository.resorts.FacilityRepositoryIplm;
import furama_management.repository.resorts.VillaRepositoryIplm;
import furama_management.service.IService;
import furama_management.util.Validate;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VillaServiceIplm implements IVillaService {
    FacilityRepositoryIplm facilityRepositoryIplm = new FacilityRepositoryIplm();
    VillaRepositoryIplm villaRepositoryIplm = new VillaRepositoryIplm();
    Scanner sc = new Scanner(System.in);
    Validate validate = new Validate();

    @Override
    public void disPlayList() {
        Map<Villa, Integer> integerMap = villaRepositoryIplm.showList();
        for (Villa v : integerMap.keySet()) {
            System.out.println(v);
        }
    }

    @Override
    public void addNewList() {
        boolean flag = true;
        String id;
        do {
            System.out.print("Nhập id: ");
            id = sc.nextLine();
            if (validate.regexIdVilla(id)) {
                System.out.println("Nhập id thành công");
            } else {
                System.err.println("Bạn nhập sai định dạng VL-XXXX");
            }
        } while (!validate.regexIdHouse(id));
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
            try {
                System.out.print("Nhập diện tích sử dụng (mét vuông): ");
                area = Double.parseDouble(sc.nextLine());
                if (area >= 30) {
                    System.out.println("Nhập diện tích thành công");
                    break;
                } else {
                    System.err.println("Diện tích không thể dưới 30 hoặc khác số");
                }
            } catch (Exception e) {
                System.err.println("Bạn nhập sai rồi");
            }
        } while (true);

        double price;
        boolean flag2 = true;
        do {
            System.out.print("Nhập chi phí thuê phòng: ");
            price = Double.parseDouble(sc.nextLine());
            if (price > 0) {
                flag2 = false;
                System.out.println("Nhập chi phí thành công");
            } else {
                System.err.println("Không nhập dưới 0 và kí tự khác");
            }
        } while (flag2);
        int maxPerson;
        do {
            try {
                System.out.print("Nhập số lượng người tối đa: ");
                maxPerson = Integer.parseInt(sc.nextLine());
                if (maxPerson < 20 && maxPerson > 0) {
                    System.out.println("Thêm thành công");
                    break;
                } else {
                    System.err.println("Số người tối đa là 20 và nhỏ nhất là 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Bạn nhập sai rồi");
            }

        } while (true);
        String tieuChuan;
        do {
            System.out.print("Tiêu chuẩn\n" +
                    "1. Vip\n" +
                    "2. Normal\n" +
                    "Mời bạn chọn: ");
            tieuChuan = sc.nextLine();
            switch (tieuChuan) {
                case "1":
                    flag = false;
                    tieuChuan = "Vip";
                    break;
                case "2":
                    flag = false;
                    tieuChuan = "Normal";
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        } while (flag);
        String date1;
        String date = null;
        boolean flag1 = true;
        int check;
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
                        flag1 = true;
                        System.out.printf("Bạn muốn thuê mấy năm: ");
                        check = Integer.parseInt(sc.nextLine());
                        try {
                            if (check > 0) {
                                System.out.println("Bạn thuê thành công " + check + " năm");
                                date = check + " năm";
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
                                date = check + " ngày";
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
        double dienTichHo;
        do {
            System.out.print("Mời bạn nhập diện tích hồ");
            dienTichHo = Double.parseDouble(sc.nextLine());
            if (dienTichHo >= 30) {
                System.out.println("Nhập thành công");
                break;
            } else {
                System.err.println("Diện tích hồ cần lớn hơn 30m2");
            }
            try {

            } catch (Exception e) {
                System.err.println("Bạn nhập sai rồi");
            }
        } while (true);
        int soTang;
        do {
            System.out.print("Nhập số tầng: ");
            soTang = Integer.parseInt(sc.nextLine());
            try {
                if (soTang > 0) {
                    System.out.println("Nhập tầng thành công");
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Cần nhập số");
            } catch (Exception e) {
                System.err.println("Mời bạn nhập lại");
            }
        } while (true);
        Villa villa = new Villa(id, name, area, price, maxPerson, date, tieuChuan, dienTichHo, soTang);
        villaRepositoryIplm.addList(villa);
    }


}
