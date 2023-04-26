package furama_management.repository;

import furama_management.model.person.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository{

    List<Customer> showList();


    void addList(Customer customer);


    void editList();
}
