package ss11_dsa_stack_queue.bai_tap.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackTwo {
    static Scanner sc = new Scanner(System.in);
    static Stack<String> st1 = new Stack<>();

    public static void main(String[] args) {

        System.out.println("nhap WORD muon");
        int countString = 0;
        String countWord = sc.nextLine();
        String[] mWord = countWord.split(" ");
        for (String l : mWord) {
            System.out.println(l);
        }
        for (String b : mWord) {
            st1.push(b);
        }
        System.out.println("mảng của Stack: " + st1);

        for (int i = st1.size() - 1; i >= 0; i--) {
            mWord[countString] = st1.get(i);
            countString++;
            st1.pop();
        }
        System.out.println("Mảng của mWord: " + Arrays.toString(mWord));
        System.out.println("mảng của Stack: " + st1);
    }
}
