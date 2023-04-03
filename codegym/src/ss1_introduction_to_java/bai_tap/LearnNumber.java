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

    public static int StringSmall(int number) {
        if (number == 11) {
            System.out.println("eleven");
        } else if (number == 12) {
            System.out.println("twelve");
        } else if (number == 13) {
            System.out.println("thirteen");
        } else if (number == 15) {
            System.out.println("fifteen");
        } else {
            System.out.println(StringSoSmall(number % 10) + "teen");
        }
        return number;
    }

    public static int StringNormal(int number) {
        if (number < 30) {
            System.out.println("Twenty " + StringSoSmall(number % 20));
        } else if (number < 40) {
            System.out.println("Thirty " + StringSoSmall(number % 30));
        } else if (number < 50) {
            System.out.println("Fourty " + StringSoSmall(number % 40));
        } else if (number < 60) {
            System.out.println("Thirty " + StringSoSmall(number % 50));
        } else if (number < 70) {
            System.out.println("Sixy " + StringSoSmall(number % 60));
        } else if (number < 80) {
            System.out.println("Seventy " + StringSoSmall(number % 70));
        } else if (number < 90) {
            System.out.println("Eighty " + StringSoSmall(number % 80));
        } else if (number < 100) {
            System.out.println("Ninety " + StringSoSmall(number % 90));
        }
        return number;
    }

    public static int StringSoLong(int number) {
        if (number < 200) {
            if (number - 100 < 10) {
                System.out.println(StringSoSmall((number + 1) - number) + " hundred " + StringSoSmall(number % 100));
            } else if (number - 100 < 20) {
                System.out.println(StringSoSmall((number + 1) - number) + " hundred " + StringSmall(number - 100));
            }else {
                System.out.println(StringSoSmall((number + 1) - number) + " hundred " + StringNormal(number - 100));
            }
        } else if (number < 300) {
            if (number - 200 < 10) {
                System.out.println(StringSoSmall((number + 1) - number) + " hundred " + StringSoSmall(number % 200));
            } else if (number - 200 < 20) {
                System.out.println(StringSoSmall((number + 1) - number) + " hundred " + StringSmall(number - 200));
            } else if (number - 200 < 30) {
                System.out.println(StringSoSmall((number + 1) - number) + " hundred " + StringNormal(number - 200));
            } else {
                System.out.println(StringSoSmall((number + 1) - number) + " hundred " + StringNormal(number - 200));
            }
        }
        return number;
    }

}

