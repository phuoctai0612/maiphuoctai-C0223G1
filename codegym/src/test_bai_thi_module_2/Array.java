package test_bai_thi_module_2;

public class Array {
    public static boolean A(int[] a) {
        int count = a[1] - a[0];
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length) {
                if (!(count == (a[i + 1] - a[i])) || (a[i] >= a[i + 1])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        if (Array.A(arr)) {
            System.out.println("mảng xịn");
        } else {
            System.out.println("Mảng lởm");
        }
    }
}
