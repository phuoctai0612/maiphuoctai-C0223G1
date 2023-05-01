package furama_management.repository.resorts;

import furama_management.model.resorts.Facility;
import furama_management.model.resorts.House;
import furama_management.model.resorts.Villa;
import furama_management.util.ReadAndWriteFacility;
import furama_management.util.ReadAndWriteVilla;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class VillaRepositoryIplm implements IVillaRepository {
    private FacilityRepositoryIplm facilityRepositoryIplm = new FacilityRepositoryIplm();
    private static final String FILE_PATH_FACILITY = "codegym/src/furama_management/box_file/facility.csv";
    private final String FILE_PART = "codegym/src/furama_management/box_file/villa.csv";
    LinkedHashMap<Villa, Integer> villaList = ReadAndWriteVilla.readFile(FILE_PART);
    LinkedHashMap<Facility, Integer> integerMapFacility = ReadAndWriteFacility.readFile(FILE_PATH_FACILITY);
@Override
    public void swapMap() {
        for (Facility f : integerMapFacility.keySet()) {
            if (f instanceof Villa) {
                villaList.put((Villa) f, 0);
            }
        }
        ReadAndWriteVilla.writeFile(FILE_PART, villaList, false);
    }

    @Override
    public LinkedHashMap<Villa, Integer> showList() {
    villaList.clear();
        swapMap();
        return villaList;
    }

    @Override
    public void addList(Villa villa) {
        integerMapFacility.put(villa, 0);
        ReadAndWriteFacility.writeFile(FILE_PATH_FACILITY,integerMapFacility,false);
        ReadAndWriteVilla.writeFile(FILE_PATH_FACILITY,villaList,false);
    }

    @Override
    public void editList() {
        ReadAndWriteVilla.writeFile(FILE_PART, villaList, false);
    }
}
