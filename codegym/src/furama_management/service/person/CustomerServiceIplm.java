package furama_management.service.person;

import furama_management.model.person.Customer;
import furama_management.repository.person.CustomerRepositoryIplm;
import furama_management.service.ICustomerServise;
import furama_management.util.Validate;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceIplm implements ICustomerServise {
    Validate validate = new Validate();
    Scanner sc = new Scanner(System.in);
    CustomerRepositoryIplm customerRepositoryIplm = new CustomerRepositoryIplm();

    @Override
    public void disPlayList() {

        List<Customer> customerList = customerRepositoryIplm.showList();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewList() {
        String id1;
        do {
            System.out.println("Nhập mã");
            id1 = sc.nextLine();
            if (validate.regexIdCustomer(id1)) {
                System.out.println("Thêm mã thành công");
            } else {
                System.err.println("Nhập mã sai định dạng KH-XXXX");
            }
        } while (!validate.regexIdCustomer(id1));
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
            if (validate.regexNumberPhone(soDienThoai1)){
                System.err.println("Thêm số điện thoại thành công");
            }else {
                System.err.println("Bạn nhập sai định dạng");
            }
        } while (validate.regexNumberPhone(soDienThoai1));
        System.out.println("Nhập email");
        String email = sc.nextLine();
        String loaiKhach;
        do {
            System.out.println("Nhập loại khách hàng\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n" +
                    "Mời bạn chọn");
            loaiKhach = sc.nextLine();
            switch (loaiKhach) {
                case "1":
                    loaiKhach = "Diamond";
                    flag = false;
                    break;
                case "2":
                    loaiKhach = "Platinum";
                    flag = false;
                    break;
                case "3":
                    loaiKhach = "Gold";
                    flag = false;
                    break;
                case "4":
                    loaiKhach = "Silver";
                    flag = false;
                    break;
                case "5":
                    loaiKhach = "Member";
                    flag = false;
                    break;
                default:
                    System.err.println("Bạn nhập sai rồi");
            }
        } while (flag);
        System.out.println("Nhập địa chỉ khách hàng");
        String diaChi = sc.nextLine();
        Customer customer = new Customer(id1, name, ngaySinh, gioiTinh, soCMND, soDienThoai1, email, loaiKhach, diaChi);
        customerRepositoryIplm.addList(customer);

    }


    public void editList() {
        boolean flag;
        boolean flag1 = true;
        int check = 0;
        do {
            System.out.println("Mời bạn chọn mục cần sửa\n" +
                    "1. Sửa mã\n" +
                    "2. Sửa tên\n" +
                    "3. Sửa ngày sinh\n" +
                    "4. Sửa giới tính\n" +
                    "5. Sửa số CMND\n" +
                    "6. Sửa số điện thoại\n" +
                    "7. Sửa Email\n" +
                    "8. Sửa loại khách\n" +
                    "9. Sửa địa chỉ\n" +
                    "0. Thoát Menu\n" +
                    "Mời bạn lựa chọn");
            String checkEmployee = sc.nextLine();
            switch (checkEmployee) {
                case "1":
                    System.out.println("Nhập mã bạn muốn sửa");
                    String id = sc.nextLine();
                    check = customerRepositoryIplm.findId(id);
                    if (check >= 0) {
                        String id1;
                        do {
                            System.out.println("Nhập mã");
                            id1 = sc.nextLine();
                            if (validate.regexIdEmployee(id1)) {
                                System.out.println("Thêm mã thành công");
                                customerRepositoryIplm.showList().get(check).setMa(id1);
                                customerRepositoryIplm.editList();
                            } else {
                                System.err.println("Nhập mã sai định dạng NV-XXXX");
                            }
                        } while (!validate.regexIdEmployee(id1));
                    } else {
                        System.err.println("Không có mã này mời bạn chọn lại");
                    }
                    break;
                case "2":
                    String name;
                    do {
                        System.out.println("Nhập tên");
                        name = sc.nextLine();
                        if (validate.regexName(name)) {
                            System.out.println("Thêm tên thành công");
                            customerRepositoryIplm.showList().get(check).setTen(name);
                            customerRepositoryIplm.editList();
                        } else {
                            System.err.println("Bạn nhập sai định dạng Viết Hoa Chữ Đầu Sau Mỗi Dấu Cách");
                        }
                    } while (!validate.regexName(name));
                    break;
                case "3":
                    String ngaySinh;
                    do {
                        System.out.println("Nhập ngày sinh");
                        ngaySinh = sc.nextLine();
                        if (validate.regexDayOfBirth(ngaySinh)) {
                            System.out.println("Thêm ngày sinh thành công");
                            customerRepositoryIplm.showList().get(check).setNgaySinh(ngaySinh);
                            customerRepositoryIplm.editList();
                        } else {
                            System.err.println("Nhập mã sai định dạng DD-MM-YYYY");
                        }
                    } while (!validate.regexDayOfBirth(ngaySinh));
                    break;
                case "4":
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
                                customerRepositoryIplm.showList().get(check).setGioiTinh(gioiTinh);
                                break;
                            case "2":
                                gioiTinh = "Nữ";
                                System.out.println("Bạn đã thêm thành công giới tính Nữ");
                                customerRepositoryIplm.showList().get(check).setGioiTinh(gioiTinh);
                                flag = false;
                                break;
                            default:
                                System.err.println("Bạn nhập sai");
                        }
                    } while (flag);
                    break;
                case "5":
                    String soCMND;
                    do {
                        System.out.println("Nhập số CMND");
                        soCMND = sc.nextLine();
                        if (validate.regexCMND(soCMND)) {
                            System.out.println("Bạn đã thêm thành công số CMND");
                            customerRepositoryIplm.showList().get(check).setSoCMND(soCMND);
                        } else {
                            System.err.println("Bạn nhập thiếu hoặc thừa số CMND rồi");
                        }
                    } while (!validate.regexCMND(soCMND));
                    break;
                case "6":
                    String soDienThoai1;
                    do {
                        System.out.println("Nhập số điện thoại");
                        soDienThoai1 = sc.nextLine();
                        if (validate.regexNumberPhone(soDienThoai1)) {
                            customerRepositoryIplm.showList().get(check).setSoDienThoai(soDienThoai1);
                        }
                    } while (!validate.regexNumberPhone(soDienThoai1));
                    break;
                case "7":
                    System.out.println("Nhập email");
                    String email = sc.nextLine();
                    customerRepositoryIplm.showList().get(check).setEmail(email);
                    break;
                case "8":
                    String loaiKhach;
                    do {
                        flag = true;
                        System.out.println("Nhập loại khách hàng\n" +
                                "1. Diamond\n" +
                                "2. Platinum\n" +
                                "3. Gold\n" +
                                "4. Silver\n" +
                                "5. Member\n" +
                                "Mời bạn chọn");
                        loaiKhach = sc.nextLine();
                        switch (loaiKhach) {
                            case "1":
                                loaiKhach = "Diamond";
                                customerRepositoryIplm.showList().get(check).setLoaiKhach(loaiKhach);
                                flag = false;
                                break;
                            case "2":
                                loaiKhach = "Platinum";
                                customerRepositoryIplm.showList().get(check).setLoaiKhach(loaiKhach);
                                flag = false;
                                break;
                            case "3":
                                loaiKhach = "Gold";
                                customerRepositoryIplm.showList().get(check).setLoaiKhach(loaiKhach);
                                flag = false;
                                break;
                            case "4":
                                loaiKhach = "Silver";
                                customerRepositoryIplm.showList().get(check).setLoaiKhach(loaiKhach);
                                flag = false;
                                break;
                            case "5":
                                loaiKhach = "Member";
                                customerRepositoryIplm.showList().get(check).setLoaiKhach(loaiKhach);
                                flag = false;
                                break;
                            default:
                                System.err.println("Bạn nhập sai rồi");
                        }
                    } while (flag);
                    break;
                case "9":
                    System.out.println("Nhập địa chỉ khách hàng");
                    String diaChi = sc.nextLine();
                    customerRepositoryIplm.showList().get(check).setDiaChi(diaChi);
                case "0":
                    System.out.println("Bạn đã thoát thành công");
                    customerRepositoryIplm.editList();
                    flag1 = false;
                    break;
            }
        } while (flag1);
    }
}

