package ss14_thuat_toan_sap_xep.bai_tap_them.repository;

import ss14_thuat_toan_sap_xep.bai_tap_them.model.Spend;

import java.util.List;

public interface ISpendRepository {
    List<Spend> showListSpend();

    void addNewListSpend(Spend spend);

    boolean deleteListSpend(String id);

    boolean editListSpend(String id);

    int findListSpend(String id);

    int findStringListSpend(String name);
}
