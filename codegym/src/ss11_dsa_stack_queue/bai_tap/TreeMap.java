package ss11_dsa_stack_queue.bai_tap;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TreeMap {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> checkMap=new ArrayList<>();
        ArrayList<String> arrayList=new ArrayList<>();
        checkMap.add("QUỐC");
        checkMap.add("TÀI");
        checkMap.add("NAM");
        checkMap.add("QUÝ");
        int key = 0;
        int value=0;
        System.out.println("nhập chuỗi tầm lâm");
        String str=sc.nextLine();
        String[] mWord = str.split(" ");
        for (int i = 0; i < mWord.length; i++) {
            arrayList.add(mWord[i].toUpperCase(Locale.ROOT));
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < checkMap.size(); j++) {
                if (arrayList.get(i).equals(checkMap.get(j))){
                   checkMap.add(mWord[i]);
                   key++;
                }else {
                    checkMap.add(mWord[i]);
                    value++;
                }
            }
            System.out.println("số lượng key: "+key+"\n" +
                    "số lượng value: "+value);
        }
    }
}
