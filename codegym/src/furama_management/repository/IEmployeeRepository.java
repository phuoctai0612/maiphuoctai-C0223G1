package furama_management.repository;

import furama_management.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository{

    List<Employee> showList();


    void addList(Employee employee);


    void editList();
}
