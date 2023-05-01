package furama_management.service;

import furama_management.model.person.Customer;
import furama_management.model.person.Employee;
import furama_management.repository.BookingRepositoryIplm;
import furama_management.util.Validate;

import java.util.List;
import java.util.Scanner;

public class BookingServiceIplm implements IBookingService {
    BookingRepositoryIplm bookingRepositoryIplm = new BookingRepositoryIplm();
    Scanner sc = new Scanner(System.in);
    Validate validate = new Validate();
    List<Customer> customers = bookingRepositoryIplm.showList();

    @Override
    public void disPlayList() {
        for (Customer c : customers) {
            System.out.println("Hiện tại mã " + c.getMa() + " đã được sử dụng");
        }
    }

    @Override
    public void addNewList() {
        disPlayList();
        String id;
        int count = 0;
        do {
            System.out.println("Nhập mã khách hàng");
            id = sc.nextLine();
            for (Customer c : customers) {
                if (c.getMa().contains(id)) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Thêm mã thành công");
            } else {
                System.err.println("Đã có mã này hoặc sai định dạng");
            }
        } while (!validate.regexIdCustomer(id));
        int dateIn = 0;
        int dateOut = 0;
        do {
            System.out.println("Nhập ngày vào");
            dateIn = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập ngày ra");
            dateOut = Integer.parseInt(sc.nextLine());

        } while (dateIn < 0 || dateIn > 31 && dateOut < 0 || dateOut > 31);
        System.out.println("Nhập mã booking");
        String idBooking = sc.nextLine();

    }
}
