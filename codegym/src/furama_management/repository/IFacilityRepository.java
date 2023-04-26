package furama_management.repository;

import furama_management.model.person.Employee;

import java.util.List;

public interface IFacilityRepository extends IRepository{

    List<Employee> showList();


    List<Employee> addList();


    void editList();

    void displayListFacilityMain();
}
