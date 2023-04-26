package furama_management.service.person;



import furama_management.model.person.Employee;
import furama_management.repository.person.EmployeeRepositoryIplm;
import furama_management.service.IEmployeeService;
import furama_management.util.Validate;

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
            System.out.println(e);
        }
    }

    @Override
    public void addNewList() {
        String id1;
        do {
            System.out.println("Nhập mã");
            id1 = sc.nextLine();
            if (validate.regexIdEmployee(id1)) {
                System.out.println("Thêm mã thành công");
            } else {
                System.err.println("Nhập mã sai định dạng NV-XXXX");
            }
        } while (!validate.regexIdEmployee(id1));
        String name;
        do {
            System.out.println("Nhập tên");
            name = sc.nextLine();
            if (validate.regexName(name)) {
                System.out.println("Thêm tên thành công");
            } else {
                System.err.println("Bạn nhập sai định dạng Viết Hoa Chữ Đầu Sau Mỗi Dấu Cách");
            }
        } while (!validate.regexName(name));
        String ngaySinh;
        do {
            System.out.println("Nhập ngày sinh");
            ngaySinh = sc.nextLine();
            if (validate.regexDayOfBirth(ngaySinh)) {
                System.out.println("Thêm ngày sinh thành công");
            } else {
                System.err.println("Nhập mã sai định dạng DD-MM-YYYY");
            }
        } while (!validate.regexDayOfBirth(ngaySinh));
        boolean flag;
        String gioiTinh;
        do {
            flag = true;
            System.out.println("Nhập chọn giới tính \n" +
                    "1. Nam\n" +
                    "2. Nữ\n" +
                    "Mời bạn chọn");
            gioiTinh = sc.nextLine();
            switch (gioiTinh) {
                case "1":
                    gioiTinh = "Nam";
                    System.out.println("Bạn đã thêm thành công giới tính Nam");
                    flag = false;
                    break;
                case "2":
                    gioiTinh = "Nữ";
                    System.out.println("Bạn đã thêm thành công giới tính Nữ");
                    flag = false;
                    break;
                default:
                    System.err.println("Bạn nhập sai");
            }
        } while (flag);
        String soCMND;
        do {
            flag = true;
            System.out.println("Nhập số CMND");
            soCMND = sc.nextLine();
            if (validate.regexCMND(String.valueOf(soCMND))) {
                System.out.println("Bạn đã thêm thành công số CMND");
                flag = false;
            } else {
                System.err.println("Bạn nhập thiếu hoặc thừa số CMND rồi");
            }
        } while (flag);
        String soDienThoai1;
        do {
            System.out.println("Nhập số điện thoại");
            soDienThoai1 = sc.nextLine();
        } while (validate.regexNumberPhone(soDienThoai1));
        System.out.println("Nhập email");
        String email = sc.nextLine();
        String trinhDo;
        do {
            flag = true;
            System.out.println("Nhập trình độ học vấn\n" +
                    "1. Trung cấp\n" +
                    "2. Cao đẳng\n" +
                    "3. Đại học\n" +
                    "4. Sau đại học\n" +
                    "Mời bạn chọn");
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
                    System.out.println(ANSI_RED + "Mời bạn nhập lại" + ANSI_RED);
            }
        } while (flag);
//lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
        String viTri;
        do {
            flag = true;
            System.out.println("Nhập vị trí trong công ty\n" +
                    "1. Lễ tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. Quản lý\n" +
                    "6. Giám đốc");
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
                    System.out.println(ANSI_RED + "Mời bạn nhập lại" + ANSI_RED);
            }
        } while (flag);
        double luong;
        do {
            System.out.println("Nhập mức lương");
            luong = Double.parseDouble(sc.nextLine());
        } while (luong < 0);
        Employee employee = new Employee(id1, name, ngaySinh, gioiTinh, soCMND, soDienThoai1, email, trinhDo, viTri, luong);
        employeeRepositoryIplm.addList(employee);
    }

    @Override
    public void editList() {
        this.disPlayList();
        System.out.println("Nhập mã bạn muốn sửa");
        String id = sc.nextLine();
        int check = employeeRepositoryIplm.findId(id);
        if (check >= 0) {
            String id1;
            do {
                System.out.println("Nhập mã");
                id1 = sc.nextLine();
                if (validate.regexIdEmployee(id1)) {
                    System.out.println("Thêm mã thành công");
                } else {
                    System.err.println("Nhập mã sai định dạng NV-XXXX");
                }
            } while (!validate.regexIdEmployee(id1));
            String name;
            do {
                System.out.println("Nhập tên");
                name = sc.nextLine();
                if (validate.regexName(name)) {
                    System.out.println("Thêm tên thành công");
                } else {
                    System.err.println("Bạn nhập sai định dạng Viết Hoa Chữ Đầu Sau Mỗi Dấu Cách");
                }
            } while (!validate.regexName(name));
            String ngaySinh;
            do {
                System.out.println("Nhập ngày sinh");
                ngaySinh = sc.nextLine();
                if (validate.regexDayOfBirth(ngaySinh)) {
                    System.out.println("Thêm ngày sinh thành công");
                } else {
                    System.err.println("Nhập mã sai định dạng DD-MM-YYYY");
                }
            } while (!validate.regexDayOfBirth(ngaySinh));
            boolean flag;
            String gioiTinh;
            do {
                flag = true;
                System.out.println("Nhập chọn giới tính \n" +
                        "1. Nam\n" +
                        "2. Nữ\n" +
                        "Mời bạn chọn");
                gioiTinh = sc.nextLine();
                switch (gioiTinh) {
                    case "1":
                        gioiTinh = "Nam";
                        System.out.println("Bạn đã thêm thành công giới tính Nam");
                        flag = false;
                        break;
                    case "2":
                        gioiTinh = "Nữ";
                        System.out.println("Bạn đã thêm thành công giới tính Nữ");
                        flag = false;
                        break;
                    default:
                        System.err.println("Bạn nhập sai");
                }
            } while (flag);
            String soCMND;
            do {
                flag = true;
                System.out.println("Nhập số CMND");
                soCMND = sc.nextLine();
                if (validate.regexCMND(String.valueOf(soCMND))) {
                    System.out.println("Bạn đã thêm thành công số CMND");
                    flag = false;
                } else {
                    System.err.println("Bạn nhập thiếu hoặc thừa số CMND rồi");
                }
            } while (flag);
            String soDienThoai1;
            do {
                flag = true;
                System.out.println("Nhập số điện thoại");
                soDienThoai1 = sc.nextLine();
            } while (validate.regexNumberPhone(soDienThoai1));
            System.out.println("Nhập email");
            String email = sc.nextLine();
            String trinhDo;
            do {
                flag = true;
                System.out.println("Nhập trình độ học vấn\n" +
                        "1. Trung cấp\n" +
                        "2. Cao đẳng\n" +
                        "3. Đại học\n" +
                        "4. Sau đại học\n" +
                        "Mời bạn chọn");
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
                        System.out.println(ANSI_RED + "Mời bạn nhập lại" + ANSI_RED);
                }
            } while (flag);
//lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
            String viTri;
            do {
                flag = true;
                System.out.println("Nhập vị trí trong công ty\n" +
                        "1. Lễ tân\n" +
                        "2. Phục vụ\n" +
                        "3. Chuyên viên\n" +
                        "4. Giám sát\n" +
                        "5. Quản lý\n" +
                        "6. Giám đốc");
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
                        System.out.println(ANSI_RED + "Mời bạn nhập lại" + ANSI_RED);
                }
            } while (flag);
            double luong;
            do {
                System.out.println("Nhập mức lương");
                luong = Double.parseDouble(sc.nextLine());
            } while (luong < 0);
            employeeRepositoryIplm.editList();
        }
    }
}
