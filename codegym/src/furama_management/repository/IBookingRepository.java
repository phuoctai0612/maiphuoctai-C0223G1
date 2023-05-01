package furama_management.repository;

import furama_management.model.person.Customer;
import furama_management.model.person.Employee;

import java.util.List;

public interface IBookingRepository {

    List<Customer> showList();


    List<Employee> addList();


    void editList();
}
