package ss14_thuat_toan_sap_xep.bai_tap_them.repository;

import ss14_thuat_toan_sap_xep.bai_tap_them.model.Spend;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SpendRepositoryIplm implements ISpendRepository {
    public static List<Spend> spendList = new LinkedList<>();

    static {
        //pend(String id, String name, String day, double money)
        spendList.add(new Spend("001", "Tài", "5", 10000));
        spendList.add(new Spend("002", "Vũ", "6", 20000));
        spendList.add(new Spend("003", "Thành", "6", 30000));
        spendList.add(new Spend("004", "Quốc", "7", 40000));

    }

    @Override
    public List<Spend> showListSpend() {
        return spendList;
    }

    @Override
    public void addNewListSpend(Spend spend) {
        spendList.add(spend);
    }

    @Override
    public boolean deleteListSpend(String id) {
        for (int i = 0; i < spendList.size(); i++) {
            if (spendList.get(i).getId().equals(id)) {
                spendList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editListSpend(String id) {
        for (int i = 0; i < spendList.size(); i++) {
            if (spendList.get(i).getId().equals(id)) {
                spendList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int findListSpend(String id) {
        for (int i = 0; i < spendList.size(); i++) {
            if (spendList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int findStringListSpend(String name) {
        for (int i = 0; i < spendList.size(); i++) {
            if (spendList.get(i).getName().contains(name)) {
                return i;
            }
        }
        return -1;
    }
}
