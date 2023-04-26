package furama_management.service;

public interface IFacilityService extends IService {
    @Override
    void disPlayList();

    @Override
    void addNewList();

    @Override
    void editList();

    void displayListFacilityMain();
}
