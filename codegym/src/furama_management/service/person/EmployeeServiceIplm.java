package furama_management.service.person;


import furama_management.model.person.Employee;
import furama_management.repository.person.EmployeeRepositoryIplm;
import furama_management.service.IEmployeeService;
import furama_management.util.Validate;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceIplm implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    EmployeeRepositoryIplm employeeRepositoryIplm = new EmployeeRepositoryIplm();
    Validate validate = new Validate();
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    public void disPlayList() {
        List<Employee> employeeList = employeeRepositoryIplm.showList();
        for (Employee e : employeeList) {
            System.out.print(e);
        }
    }

    @Override
    public void addNewList() {
        String id1;
        do {
            System.out.print("Nhập mã: ");
            id1 = sc.nextLine();
            if (validate.regexIdEmployee(id1)) {
                System.out.print("Thêm mã thành công");
            } else {
                System.err.print("Nhập mã sai định dạng NV-XXXX");
            }
        } while (!validate.regexIdEmployee(id1));
        String name;
        do {
            System.out.print("Nhập tên: ");
            name = sc.nextLine();
            if (validate.regexName(name)) {
                System.out.print("Thêm tên thành công");
            } else {
                System.err.print("Bạn nhập sai định dạng Viết Hoa Chữ Đầu Sau Mỗi Dấu Cách");
            }
        } while (!validate.regexName(name));
        String ngaySinh;
        boolean check1 = true;
        do {
            System.out.print("Nhập ngày sinh: ");
            ngaySinh = sc.nextLine();
            LocalDate dob = LocalDate.parse(ngaySinh);
            if (validate.regexDayOfBirth(ngaySinh)) {
                if (validate.checkAge(dob) >= 18) {
                    System.out.print("Thêm ngày sinh thành công");
                    check1 = false;
                } else {
                    System.out.print("Bạn chưa đủ 18 tuổi");
                }
            } else {
                System.err.print("Nhập mã sai định dạng yyyy-mm-dd");
            }
        } while (check1);
        boolean flag;
        String gioiTinh;
        do {
            flag = true;
            System.out.print("Nhập chọn giới tính \n" +
                    "1. Nam\n" +
                    "2. Nữ\n" +
                    "Mời bạn chọn: ");
            gioiTinh = sc.nextLine();
            switch (gioiTinh) {
                case "1":
                    gioiTinh = "Nam";
                    System.out.print("Bạn đã thêm thành công giới tính Nam");
                    flag = false;
                    break;
                case "2":
                    gioiTinh = "Nữ";
                    System.out.print("Bạn đã thêm thành công giới tính Nữ");
                    flag = false;
                    break;
                default:
                    System.err.print("Bạn nhập sai");
            }
        } while (flag);
        String soCMND;
        do {
            flag = true;
            System.out.print("Nhập số CMND: ");
            soCMND = sc.nextLine();
            if (validate.regexCMND(String.valueOf(soCMND))) {
                System.out.print("Bạn đã thêm thành công số CMND");
                flag = false;
            } else {
                System.err.print("Bạn nhập thiếu hoặc thừa số CMND rồi");
            }
        } while (flag);
        String soDienThoai1;
        do {
            System.out.print("Nhập số điện thoại: ");
            soDienThoai1 = sc.nextLine();
            if (validate.regexNumberPhone(soDienThoai1)) {
                System.out.print("Thêm số điện thoại thành công");
            } else {
                System.err.print("Nhập sai");
            }
        } while (!validate.regexNumberPhone(soDienThoai1));
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        String trinhDo;
        do {
            flag = true;
            System.out.print("Nhập trình độ học vấn\n" +
                    "1. Trung cấp\n" +
                    "2. Cao đẳng\n" +
                    "3. Đại học\n" +
                    "4. Sau đại học\n" +
                    "Mời bạn chọn: ");
            trinhDo = sc.nextLine();
            switch (trinhDo) {
                case "1":
                    trinhDo = "Trung cấp";
                    flag = false;
                    break;
                case "2":
                    trinhDo = "Cao đẳng";
                    flag = false;
                    break;
                case "3":
                    trinhDo = "Đại học";
                    flag = false;
                    break;
                case "4":
                    trinhDo = "Sau đại học";
                    flag = false;
                    break;
                default:
                    System.out.print(ANSI_RED + "Mời bạn nhập lại" + ANSI_RED);
            }
        } while (flag);
//lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
        String viTri;
        do {
            flag = true;
            System.out.print("Nhập vị trí trong công ty\n" +
                    "1. Lễ tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. Quản lý\n" +
                    "6. Giám đốc\n" +
                    "Mời bạn chọn: ");
            viTri = sc.nextLine();
            switch (viTri) {
                case "1":
                    viTri = "Lễ tân";
                    flag = false;
                    break;
                case "2":
                    viTri = "Phục vụ";
                    flag = false;
                    break;
                case "3":
                    viTri = "Chuyên viên";
                    flag = false;
                    break;
                case "4":
                    viTri = "Giám sát";
                    flag = false;
                    break;
                case "5":
                    viTri = "Quản lý";
                    flag = false;
                    break;
                case "6":
                    viTri = "Giám đốc";
                    flag = false;
                    break;
                default:
                    System.out.print(ANSI_RED + "Mời bạn nhập lại" + ANSI_RED);
            }
        } while (flag);
        double luong;
        do {
            System.out.print("Nhập mức lương: ");
            luong = Double.parseDouble(sc.nextLine());
        } while (luong < 0);
        Employee employee = new Employee(id1, name, ngaySinh, gioiTinh, soCMND, soDienThoai1, email, trinhDo, viTri, luong);
        employeeRepositoryIplm.addList(employee);
    }

    @Override
    public void editList() {
        boolean flag;
        boolean flag1 = true;
        int check = 0;
        do {
            System.out.print("Mời bạn chọn mục cần sửa\n" +
                    "1. Sửa mã\n" +
                    "2. Sửa tên\n" +
                    "3. Sửa ngày sinh\n" +
                    "4. Sửa giới tính\n" +
                    "5. Sửa số CMND\n" +
                    "6. Sửa số điện thoại\n" +
                    "7. Sửa Email\n" +
                    "8. Sửa trình độ\n" +
                    "9. Sửa vị trí\n" +
                    "10. Sửa lương\n" +
                    "0. Thoát Menu\n" +
                    "Mời bạn lựa chọn: ");
            String checkEmployee = sc.nextLine();
            switch (checkEmployee) {
                case "1":
                    System.out.print("Nhập mã bạn muốn sửa: ");
                    String id = sc.nextLine();
                    check = employeeRepositoryIplm.findId(id);
                    if (check >= 0) {
                        String id1;
                        do {
                            System.out.print("Nhập mã: ");
                            id1 = sc.nextLine();
                            if (validate.regexIdEmployee(id1)) {
                                System.out.print("Thêm mã thành công");
                                employeeRepositoryIplm.showList().get(check).setMa(id1);
                                employeeRepositoryIplm.editList();
                            } else {
                                System.err.print("Nhập mã sai định dạng NV-XXXX");
                            }
                        } while (!validate.regexIdEmployee(id1));
                    } else {
                        System.err.print("Không có mã này mời bạn chọn lại");
                    }
                    break;
                case "2":
                    String name;
                    do {
                        System.out.print("Nhập tên: ");
                        name = sc.nextLine();
                        if (validate.regexName(name)) {
                            System.out.print("Thêm tên thành công");
                            employeeRepositoryIplm.showList().get(check).setTen(name);
                            employeeRepositoryIplm.editList();
                        } else {
                            System.err.print("Bạn nhập sai định dạng Viết Hoa Chữ Đầu Sau Mỗi Dấu Cách");
                        }
                    } while (!validate.regexName(name));
                    break;
                case "3":
                    String ngaySinh;
                    boolean check1 = true;
                    do {
                        System.out.print("Nhập ngày sinh: ");
                        ngaySinh = sc.nextLine();
                        LocalDate dob = LocalDate.parse(ngaySinh);
                        System.out.print(dob);
                        if (validate.regexDayOfBirth(ngaySinh)) {
                            if (validate.checkAge(dob) >= 18) {
                                System.out.print("Thêm ngày sinh thành công.");
                                employeeRepositoryIplm.showList().get(check).setNgaySinh(ngaySinh);
                                employeeRepositoryIplm.editList();
                                check1 = false;
                            } else {
                                System.out.print("Bạn chưa đủ 18 tuổi");
                            }
                        } else {
                            System.err.print("Nhập mã sai định dạng DD-MM-YYYY");
                        }
                    } while (check1);
                    break;
                case "4":
                    String gioiTinh;
                    do {
                        flag = true;
                        System.out.print("Nhập chọn giới tính \n" +
                                "1. Nam\n" +
                                "2. Nữ\n" +
                                "Mời bạn chọn: ");
                        gioiTinh = sc.nextLine();
                        switch (gioiTinh) {
                            case "1":
                                gioiTinh = "Nam";
                                System.out.print("Bạn đã thêm thành công giới tính Nam");
                                flag = false;
                                employeeRepositoryIplm.showList().get(check).setGioiTinh(gioiTinh);
                                break;
                            case "2":
                                gioiTinh = "Nữ";
                                System.out.print("Bạn đã thêm thành công giới tính Nữ");
                                employeeRepositoryIplm.showList().get(check).setGioiTinh(gioiTinh);
                                flag = false;
                                break;
                            default:
                                System.err.print("Bạn nhập sai");
                        }
                    } while (flag);
                    break;
                case "5":
                    String soCMND;
                    do {
                        System.out.print("Nhập số CMND: ");
                        soCMND = sc.nextLine();
                        if (validate.regexCMND(soCMND)) {
                            System.out.print("Bạn đã thêm thành công số CMND");
                            employeeRepositoryIplm.showList().get(check).setSoCMND(soCMND);
                        } else {
                            System.err.print("Bạn nhập thiếu hoặc thừa số CMND rồi");
                        }
                    } while (!validate.regexCMND(soCMND));
                    break;
                case "6":
                    String soDienThoai1;
                    do {
                        System.out.print("Nhập số điện thoại: ");
                        soDienThoai1 = sc.nextLine();
                        if (validate.regexNumberPhone(soDienThoai1)) {
                            employeeRepositoryIplm.showList().get(check).setSoDienThoai(soDienThoai1);
                        }
                    } while (!validate.regexNumberPhone(soDienThoai1));
                    break;
                case "7":
                    System.out.print("Nhập email: ");
                    String email = sc.nextLine();
                    employeeRepositoryIplm.showList().get(check).setEmail(email);
                    break;
                case "8":
                    String trinhDo;
                    do {
                        flag = true;
                        System.out.print("Nhập trình độ học vấn\n" +
                                "1. Trung cấp\n" +
                                "2. Cao đẳng\n" +
                                "3. Đại học\n" +
                                "4. Sau đại học\n" +
                                "Mời bạn chọn: ");
                        trinhDo = sc.nextLine();
                        switch (trinhDo) {
                            case "1":
                                trinhDo = "Trung cấp";
                                employeeRepositoryIplm.showList().get(check).setTrinhDo(trinhDo);
                                flag = false;
                                break;
                            case "2":
                                trinhDo = "Cao đẳng";
                                employeeRepositoryIplm.showList().get(check).setTrinhDo(trinhDo);
                                flag = false;
                                break;
                            case "3":
                                trinhDo = "Đại học";
                                employeeRepositoryIplm.showList().get(check).setTrinhDo(trinhDo);
                                flag = false;
                                break;
                            case "4":
                                trinhDo = "Sau đại học";
                                employeeRepositoryIplm.showList().get(check).setTrinhDo(trinhDo);
                                flag = false;
                                break;
                            default:
                                System.out.print(ANSI_RED + "Mời bạn nhập lại" + ANSI_RED);
                        }
                    } while (flag);
                    break;
                case "9":
                    String viTri;
                    do {
                        flag = true;
                        System.out.print("Nhập vị trí trong công ty\n" +
                                "1. Lễ tân\n" +
                                "2. Phục vụ\n" +
                                "3. Chuyên viên\n" +
                                "4. Giám sát\n" +
                                "5. Quản lý\n" +
                                "6. Giám đốc\n" +
                                "Mời bạn nhập: ");
                        viTri = sc.nextLine();
                        switch (viTri) {
                            case "1":
                                viTri = "Lễ tân";
                                employeeRepositoryIplm.showList().get(check).setViTri(viTri);
                                flag = false;
                                break;
                            case "2":
                                viTri = "Phục vụ";
                                employeeRepositoryIplm.showList().get(check).setViTri(viTri);
                                flag = false;
                                break;
                            case "3":
                                viTri = "Chuyên viên";
                                employeeRepositoryIplm.showList().get(check).setViTri(viTri);
                                flag = false;
                                break;
                            case "4":
                                viTri = "Giám sát";
                                employeeRepositoryIplm.showList().get(check).setViTri(viTri);
                                flag = false;
                                break;
                            case "5":
                                viTri = "Quản lý";
                                employeeRepositoryIplm.showList().get(check).setViTri(viTri);
                                flag = false;
                                break;
                            case "6":
                                viTri = "Giám đốc";
                                employeeRepositoryIplm.showList().get(check).setViTri(viTri);
                                flag = false;
                                break;
                            default:
                                System.out.print(ANSI_RED + "Mời bạn nhập lại" + ANSI_RED);
                        }
                    } while (flag);
                    break;
                case "10":
                    double luong;
                    do {
                        System.out.print("Nhập mức lương: ");
                        luong = Double.parseDouble(sc.nextLine());
                        employeeRepositoryIplm.showList().get(check).setLuong(luong);
                    } while (luong < 0);
                    break;
                case "0":
                    System.out.print("Bạn đã thoát thành công.");
                    employeeRepositoryIplm.editList();
                    flag1 = false;
                    break;
            }
        } while (flag1);
    }
}
