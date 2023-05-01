package furama_management.repository.resorts;

import furama_management.model.resorts.Facility;
import furama_management.model.resorts.House;
import furama_management.util.ReadAndWriteFacility;
import furama_management.util.ReadAndWriteHouse;

import java.util.LinkedHashMap;

public class HouseRepositoryIplm implements IHouseRepository {
    private static final String FILE_PATH_FACILITY = "codegym/src/furama_management/box_file/facility.csv";
    LinkedHashMap<Facility, Integer> integerMapFacility = ReadAndWriteFacility.readFile(FILE_PATH_FACILITY);
    private final String FILE_PATH = "codegym/src/furama_management/box_file/house.csv";
    LinkedHashMap<House, Integer> integerMap1 = ReadAndWriteHouse.readFile(FILE_PATH);


    @Override
    public void swapMap() {
        for (Facility f : integerMapFacility.keySet()) {
            if (f instanceof House) {
                integerMap1.put((House) f, 0);
            }
        }
        ReadAndWriteHouse.writeFile(FILE_PATH, integerMap1, false);
    }

    @Override
    public LinkedHashMap<House, Integer> showList() {
        integerMap1.clear();
        swapMap();
        return integerMap1;
    }

    @Override
    public void addList(House house) {
        integerMapFacility.put(house, 0);
        ReadAndWriteFacility.writeFile(FILE_PATH_FACILITY, integerMapFacility, false);
        ReadAndWriteHouse.writeFile(FILE_PATH, integerMap1, false);
    }

    @Override
    public void editList() {
        ReadAndWriteHouse.writeFile(FILE_PATH, integerMap1, false);
    }
}
