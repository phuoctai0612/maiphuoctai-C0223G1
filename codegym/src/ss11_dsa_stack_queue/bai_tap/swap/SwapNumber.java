package ss11_dsa_stack_queue.bai_tap.swap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SwapNumber {
    static Stack<Integer> st = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        System.out.println("nhập số muốn tìm số nhị phân");
        int kiemTra = sc.nextInt();
        int count1 = 0;

        while (kiemTra != 0) {
            count1 = kiemTra % 2;
            st.push(count1);
            kiemTra /= 2;
            count++;
        }
        int[] arr = new int[count];
        System.out.println(st);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
