package furama_management.repository.resorts;

import furama_management.model.resorts.House;
import furama_management.model.resorts.Room;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IRoomRepository {
    void swapMap();
    LinkedHashMap<Room,Integer> showList();
    void addList(Room room);
    void editList();
}
