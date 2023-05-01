package furama_management.repository.resorts;

import furama_management.model.resorts.Facility;
import furama_management.model.resorts.House;
import furama_management.model.resorts.Room;
import furama_management.service.IService;
import furama_management.util.ReadAndWriteFacility;
import furama_management.util.ReadAndWriteHouse;
import furama_management.util.ReadAndWriteRoom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepositoryIplm implements IRoomRepository {
    private FacilityRepositoryIplm facilityRepositoryIplm = new FacilityRepositoryIplm();
    private static final String FILE_PATH_FACILITY = "codegym/src/furama_management/box_file/facility.csv";
    private final String FILE_PATH = "codegym/src/furama_management/box_file/room.csv";
    LinkedHashMap<Room, Integer> integerMap = ReadAndWriteRoom.readFile(FILE_PATH);
    LinkedHashMap<Facility, Integer> integerMapFacility = ReadAndWriteFacility.readFile(FILE_PATH_FACILITY);


    @Override
    public void swapMap() {
        for (Facility f : integerMapFacility.keySet()) {
            if (f instanceof Room) {
                integerMap.put((Room) f, 0);
            }
        }
        ReadAndWriteRoom.writeFile(FILE_PATH, integerMap, false);
    }

    @Override
    public LinkedHashMap<Room, Integer> showList() {
        integerMap.clear();
        swapMap();
        return integerMap;
    }

    @Override
    public void addList(Room room) {
        integerMapFacility.put(room, 0);
        ReadAndWriteFacility.writeFile(FILE_PATH_FACILITY,integerMapFacility,false);
        ReadAndWriteRoom.writeFile(FILE_PATH, integerMap, false);
    }

    @Override
    public void editList() {
        ReadAndWriteRoom.writeFile(FILE_PATH, integerMap, false);
    }
}
