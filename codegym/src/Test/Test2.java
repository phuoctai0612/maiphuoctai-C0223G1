package Test;

import java.util.Arrays;

public class Test2 {
        public static String a(String s) {
            String []arr=s.split("");
            String b=s.toLowerCase();
            String[] arr1 = b.split("");
            String a = arr1[0].toLowerCase();
            for (int i = 1; i < arr1.length; i++) {
                if(arr1[i].equals(arr[i])){
                    a+=arr[i];
                }else{
                    a+=" "+arr[i];
                }
            }
            return a;
        }
        public static void main(String[] args) {
            System.out.println(Test2.a("CodegymDaNang"));
        }
}
