package ss11_dsa_stack_queue.bai_tap.palirome;

import java.util.*;

public class QueueManagement {
    static Queue<String> q = new ArrayDeque<>();
    static Stack<String> st = new Stack<>();

    public static void main(String[] args) {
        String a = "Able was I ere I saw Elba";
        String[] arr = a.split("");
        for (String arr1 : arr) {
            q.add(arr1.toUpperCase());
            st.push(arr1.toUpperCase());
        }
        System.out.println(q);
        System.out.println(st);
        boolean flag = true;
        for (int i = 0; i < q.size(); i++) {
            if (!Objects.equals(q.remove(), st.get(i))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}

