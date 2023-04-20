package test_bai_thi_module_2;

public class Bai2 {
    public static String A(int num) {
        String a = String.valueOf(num);
        String b = "";
        if (num < 10000 && num > 999) {
            a += num;
//            String[] arr = a.split("");
            for (int i = 0; i < a.length()-1; i++) {//4
                for (int j = i + 1; j < a.length()-3; j++) {

                        if (Integer.parseInt(String.valueOf(a.charAt(i))) > Integer.parseInt(String.valueOf(a.charAt(j)))) {
                            b += Integer.parseInt(String.valueOf(a.charAt(i)));
                            break;
                        }else {
                            continue;
                        }
                }
            }
            return b;
        }
        return "Không có";
    }

    public static void main(String[] args) {
        System.out.println(Bai2.A(6699));
    }
}
