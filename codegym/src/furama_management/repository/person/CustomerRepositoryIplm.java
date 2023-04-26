package furama_management.repository.person;

import furama_management.model.person.Customer;
import furama_management.repository.ICustomerRepository;
import furama_management.util.ReadAndWriteCustomer;

import java.util.List;

public class CustomerRepositoryIplm implements ICustomerRepository {
    private final String CHECK = "codegym/src/furama_management/box_file/customer.csv";
        List<Customer> customerList = ReadAndWriteCustomer.readFile(CHECK);
    public int findId(String id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMa().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Customer> showList() {
        return customerList;
    }

    @Override
    public void addList(Customer customer) {

    }

    @Override
    public void editList() {

    }
}
