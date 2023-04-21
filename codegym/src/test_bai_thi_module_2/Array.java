package test_bai_thi_module_2;

public class Array {
    public static boolean A(int[] a) {
        if (a.length <= 1) {
            return false;
        }
        int count = a[1] - a[0];
        if (count <= 0) {
            return false;
        }
        for (int i = 2; i < a.length - 1; i++) {
            if (a[i] - a[i - 1] != count) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1};
        if (Array.A(arr)) {
            System.out.println("mảng xịn");
        } else {
            System.out.println("Mảng lởm");
        }
    }
}
