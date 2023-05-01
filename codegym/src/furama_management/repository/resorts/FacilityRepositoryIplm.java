package furama_management.repository.resorts;

import furama_management.model.resorts.Facility;
import furama_management.model.resorts.House;
import furama_management.model.resorts.Room;
import furama_management.model.resorts.Villa;
import furama_management.repository.IFacilityRepository;
import furama_management.util.ReadAndWriteFacility;

import java.util.LinkedHashMap;
import java.util.Map;


public class FacilityRepositoryIplm implements IFacilityRepository {
    private static final String FILE_PATH_FACILITY="codegym/src/furama_management/box_file/facility.csv";
    static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    static {
        House house = new House("HO-0001", "Massa", 30, 20, 15, "25", "Vip", 5);
        House house1 = new House("HO-0002", "Massa", 30, 20, 15, "25", "Normal", 5);
        House house2 = new House("HO-0003", "Massa", 30, 20, 15, "25", "Normal", 5);
        House house3 = new House("HO-0004", "Massa", 30, 20, 15, "25", "Vip", 5);
        House house4 = new House("HO-0005", "Massa", 30, 20, 15, "25", "Vip", 5);
        Room room = new Room("RO-0001", "Massa", 30, 20, 15, "25", "Ăn cơm trưa");
        Room room1 = new Room("RO-0002", "Massa", 30, 20, 15, "25", "Massage");
        Room room2 = new Room("RO-0003", "Massa", 30, 20, 15, "25", "Ăn sáng");
        Room room3 = new Room("RO-0004", "Massa", 30, 20, 15, "25", "Ăn cơm trưa");
        Room room4 = new Room("RO-0005", "Massa", 30, 20, 15, "25", "Ăn cơm trưa");
        Room room5 = new Room("RO-0006", "Massa", 30, 20, 15, "25", "Ăn cơm trưa");
        Villa villa = new Villa("VL-0001", "Massa", 30, 20, 15, "25", "Vip", 35, 10);
        Villa villa1 = new Villa("VL-0002", "Massa", 30, 20, 15, "25", "Normal", 35, 10);
        Villa villa2 = new Villa("VL-0003", "Massa", 30, 20, 15, "25", "Normal", 35, 10);
        Villa villa3 = new Villa("VL-0004", "Massa", 30, 20, 15, "25", "Vip", 35, 10);
        Villa villa4 = new Villa("VL-0005", "Massa", 30, 20, 15, "25", "Vip", 35, 10);
        Villa villa5 = new Villa("VL-0006", "Massa", 30, 20, 15, "25", "Vip", 35, 10);
        linkedHashMap.put(house, 0);
        linkedHashMap.put(house1, 0);
        linkedHashMap.put(house2, 0);
        linkedHashMap.put(house3, 0);
        linkedHashMap.put(house4, 0);
        linkedHashMap.put(room, 0);
        linkedHashMap.put(room1, 0);
        linkedHashMap.put(room2, 0);
        linkedHashMap.put(room3, 0);
        linkedHashMap.put(room4, 0);
        linkedHashMap.put(room5, 0);
        linkedHashMap.put(villa, 0);
        linkedHashMap.put(villa1, 0);
        linkedHashMap.put(villa2, 0);
        linkedHashMap.put(villa3, 0);
        linkedHashMap.put(villa4, 0);
        linkedHashMap.put(villa5, 0);
    }


    @Override
    public  LinkedHashMap<Facility,Integer> displayListFacilityMain() {
        if (ReadAndWriteFacility.readFile(FILE_PATH_FACILITY).size()==0){
            ReadAndWriteFacility.writeFile(FILE_PATH_FACILITY,linkedHashMap,false);
            return linkedHashMap;
        }
      return ReadAndWriteFacility.readFile(FILE_PATH_FACILITY);
    }
}
