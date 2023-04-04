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
                s = "One";
                break;
            case 2:
                s = "Two";
                break;
            case 3:
                s = "Three";
                break;
            case 4:
                s = "Four";
                break;
            case 5:
                s = "Five";
                break;
            case 6:
                s = "Six";
                break;
            case 7:
                s = "Seven";
                break;
            case 8:
                s = "Eight";
                break;
            case 9:
                s = "Nine";
                break;
            case 10:
                s = "Ten";
        }
        return s;
    }

    public static String StringSmall(int number) {
        String str = "";
        if (number == 11) {
            str = "Eleven";
        } else if (number == 12) {
            str = "Twelve";
        } else if (number == 13) {
            str = "Thirteen";
        } else if (number == 15) {
            str = "Fifteen";
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
            str = StringSoSmall(number / 100) + " Hundred " + StringSoSmall(number % 100);
        } else if (number < 1000 && number % 100 < 20) {
            str = StringSoSmall(number / 100) + " Hundred " + StringSmall(number % 100);
        } else {
            str = StringSoSmall(number / 100) + " Hundred " + StringNormal(number % 100);
        }
        return str;
    }
}

