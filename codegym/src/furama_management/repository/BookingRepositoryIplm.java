package furama_management.repository;

import furama_management.model.person.Customer;
import furama_management.model.person.Employee;
import furama_management.repository.person.CustomerRepositoryIplm;
import furama_management.util.ReadAndWriteCustomer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class BookingRepositoryIplm implements IBookingRepository {
    private final String CHECK = "codegym/src/furama_management/box_file/customer.csv";
    CustomerRepositoryIplm customerRepositoryIplm = new CustomerRepositoryIplm();
    List<Customer> customerList= ReadAndWriteCustomer.readFile(CHECK);

    @Override
    public List<Customer> showList() {
        return customerList;
    }

    @Override
    public List<Employee> addList() {
        return null;
    }

    @Override
    public void editList() {

    }
}
