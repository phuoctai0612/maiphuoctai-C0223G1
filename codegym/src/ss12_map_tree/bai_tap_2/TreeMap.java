package ss12_map_tree.bai_tap_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
        String strTree = "khong chin tam mot tam bon chin hai tam chin";
        String[] str = strTree.split(" ");
        Map<String, Integer> hashMap = new HashMap<>();
        for (String s : str) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }
        Set<String> stringSet = hashMap.keySet();
        for (String st : stringSet) {
            System.out.println(" Từ " + st + " xuất hiện: " + hashMap.get(st) + " lần");
        }
    }
}
