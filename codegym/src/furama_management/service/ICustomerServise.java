package furama_management.service;

public interface ICustomerServise extends IService{
    @Override
    void disPlayList();

    @Override
    void addNewList();

    void editList();
}
