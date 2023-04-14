package ss11_dsa_stack_queue.bai_tap.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackOne {
    static Stack<Integer> st = new Stack<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhap so phan tu muon them vao");
        int count = 0;
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("nhap cac phan tu thu: " + i);
            int index = sc.nextInt();
            arr[i] = index;
        }
        for (int i = 0; i < a; i++) {
            st.push(arr[i]);
        }
        System.out.println("mang ban dau: " + Arrays.toString(arr));
        System.out.println(st);
        for (int i = a - 1; i >= 0; i--) {
            arr[i] = st.get(count);
            count++;
        }
        System.out.println("Mang sau khi chuyen doi: " + Arrays.toString(arr));
    }
}
