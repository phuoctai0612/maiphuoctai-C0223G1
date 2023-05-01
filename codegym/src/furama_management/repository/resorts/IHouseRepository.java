package furama_management.repository.resorts;

import furama_management.model.resorts.House;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IHouseRepository {
    void swapMap();
    LinkedHashMap<House,Integer> showList();
    void addList(House house);
    void editList();
}
