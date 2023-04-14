package ss11_dsa_stack_queue.bai_tap.check_bracket;

import java.util.Arrays;

public class Bracket {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0;
        boolean flag = true;
        String a = "s * (s – a) * (s – b) * (s – c)";
        String[] b = a.split("");
        System.out.println(Arrays.toString(b));
        if (b[0].equals(")")) {
            flag = false;
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j].equals("(")) {
                    count++;
                } else if (b[j].equals(")")) {
                    count1++;
                }
            }
        }
        if (count == count1) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }
}
