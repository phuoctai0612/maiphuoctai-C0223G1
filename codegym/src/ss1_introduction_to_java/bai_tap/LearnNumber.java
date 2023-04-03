package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class LearnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần đọc");
        int number = sc.nextInt();
        if (number < 11) {
            System.out.println(StringSoSmall(number));
        } else if (number < 20) {
            System.out.println(StringSmall(number));
        } else if (number < 100) {
            System.out.println(StringNormal(number));
        } else if (number < 1000) {
            System.out.println(StringSoLong(number));
        }
    }

    public static String StringSoSmall(int number) {
        String s = "";
        switch (number) {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
            case 3:
                s = "three";
                break;
            case 4:
                s = "four";
                break;
            case 5:
                s = "five";
                break;
            case 6:
                s = "six";
                break;
            case 7:
                s = "seven";
                break;
            case 8:
                s = "eight";
                break;
            case 9:
                s = "nine";
                break;
            case 10:
                s = "ten";
        }
        return s;
    }

    public static String StringSmall(int number) {
        String str = "";
        if (number == 11) {
            str = "eleven";
        } else if (number == 12) {
            str = "twelve";
        } else if (number == 13) {
            str = "thirteen";
        } else if (number == 15) {
            str = "fifteen";
        } else {
            str = (number % 10 + "teen");
        }
        return str;
    }

    public static String StringNormal(int number) {
        String str = "";
        str = StringSoSmall(number / 10) + "ty " + StringSoSmall(number % 10);
        return str;
    }

    public static String StringSoLong(int number) {
        String str = "";
        if (number < 1000 && number % 100 < 10) {
            str = StringSoSmall(number / 100) + " hundred " + StringSoSmall(number % 100);
        } else if (number < 1000 && number % 100 < 20) {
            str = StringSoSmall(number / 100) + " hundred " + StringSmall(number % 100);
        } else {
            str = StringSoSmall(number / 100) + " hundred " + StringNormal(number % 100);
        }
        return str;
    }
}

