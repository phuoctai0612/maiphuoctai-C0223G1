package furama_management.repository.resorts;

import furama_management.model.resorts.Villa;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IVillaRepository {
    void swapMap();
    LinkedHashMap<Villa,Integer> showList();

    void addList(Villa villa);

    void editList();
}
