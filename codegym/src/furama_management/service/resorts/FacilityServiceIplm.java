package furama_management.service.resorts;

import furama_management.model.resorts.Facility;
import furama_management.model.resorts.House;
import furama_management.model.resorts.Room;
import furama_management.model.resorts.Villa;
import furama_management.repository.resorts.FacilityRepositoryIplm;
import furama_management.service.IFacilityService;
import furama_management.service.IService;
import furama_management.util.ReadAndWriteFacility;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceIplm implements IService, IFacilityService {
    private  final String FILE_PATH_FACILITY="codegym/src/furama_management/box_file/facility.csv";
    FacilityRepositoryIplm facilityRepositoryIplm = new FacilityRepositoryIplm();

    @Override
    public void disPlayList() {
        LinkedHashMap<Facility,Integer> integerMap=
                facilityRepositoryIplm.displayListFacilityMain();
        for (Facility f: integerMap.keySet()) {
            System.out.println(f);
        }
    }

    @Override
    public void addNewList() {

    }
}
