package Test;

import java.util.*;

public class Test1 {
    public static String a(String s) {
        String[] arr = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        String[] arr1 = s.split("");
        String a = arr1[0].toLowerCase();
        System.out.println(Arrays.toString(arr1));
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr1[i].equals(arr[j].toUpperCase())) {
                    a += " " + arr[j];
                    break;
                } else if (arr1[i].equals(arr[j])){
                    a += arr[j].toLowerCase();
                    break;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Test1 test1=new Test1();
        System.out.println(Test1.a("CodegymDaNang"));
    }
}
