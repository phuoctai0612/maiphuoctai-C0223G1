package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_lien_tiep;

import java.util.LinkedList;
import java.util.Scanner;

public class Remake {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        LinkedList<Character> linkedList1 = new LinkedList<>();
        System.out.println("nhập chuỗi bạn thích");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (linkedList.size() > 1 && str.charAt(i) <= linkedList.getLast()
                    && linkedList.contains(str.charAt(i))) {
                linkedList.clear();
            }
            linkedList.add(str.charAt(i));
            if (linkedList.size() > linkedList1.size()) {
                linkedList1.clear();
                linkedList1.addAll(linkedList);
            }
        }
        System.out.println("Chuỗi dài nhất là: ");
        for (Character ch : linkedList1) {
            System.out.print(ch);
        }
    }
}
