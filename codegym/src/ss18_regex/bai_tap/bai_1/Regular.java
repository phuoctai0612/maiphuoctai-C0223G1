package ss18_regex.bai_tap.bai_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regular {
    public static boolean Validate(String num) {
        final String VARIABLE = "^(C|A|P)\\d{4}(G|H|I|K)";
        return Pattern.matches(VARIABLE, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String num = sc.nextLine();
        System.out.println(Regular.Validate(num));
    }
}
