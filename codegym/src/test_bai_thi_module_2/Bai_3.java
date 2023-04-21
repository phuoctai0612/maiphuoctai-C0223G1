package test_bai_thi_module_2;

import java.util.Arrays;

public class Bai_3 {
    public static void main(String[] args) {
        String  a ="asdasd";
        char[] b=new char[a.length()];
        a.getChars(0, b.length-3, b,1);
        System.out.println(Arrays.toString(b));
    }
}
