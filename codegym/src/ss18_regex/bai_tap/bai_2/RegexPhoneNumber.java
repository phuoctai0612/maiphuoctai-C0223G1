package ss18_regex.bai_tap.bai_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPhoneNumber {
    public static boolean checkNumber(String string){
        final String PATTERN="^(0\\d{9}|84(0){1}\\d{9})";
        return Pattern.matches(PATTERN,string);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("nhap sdt zo");
            String num=sc.nextLine();
            if (checkNumber(num)){
                System.out.println("SDT dung: "+num);
                flag=false;
            }
        }while (flag);

    }
}
