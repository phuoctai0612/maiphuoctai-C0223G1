package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LookingForString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhập một chuỗi bạn muốn");
        String strings = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < strings.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(strings.charAt(i));
            for (int j = i + 1; j < strings.length(); j++) {
                if (strings.charAt(j) > list.getLast()) {
                    list.add(strings.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.println(ch);
        }
    }
}
