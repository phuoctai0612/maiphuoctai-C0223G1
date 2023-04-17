package Test;

import java.util.Map;
import java.util.TreeMap;

class ChuNhat {
    public static void main(String[] args) {
Map<Character, Integer> mapChar = new TreeMap<>();
mapChar.put('A', 1);
mapChar.put('B', 2);
mapChar.put('C', 3);
mapChar.put('D', 4);
mapChar.put('E', 5);
mapChar.put('F', 6);

// Cách duyệt Map với forEach() trong Java 8
// đối số thứ nhất bên trong forEach là key
// đối số thứ hai bên trong forEach là value
mapChar.forEach((keyChar, valueInt) -> System.out.println(
                    "Key = " + keyChar + ", value = " + valueInt));
        }
}