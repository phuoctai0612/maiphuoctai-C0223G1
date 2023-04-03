package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CheckHeightWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao :");
        double height = sc.nextDouble();
        System.out.println("nhập cân nặng :");
        double weight = sc.nextDouble();
        double bmi = weight/Math.pow(height,2);
        if (bmi<18.5){
            System.out.println("Quá ốm yếu");
        }else if (bmi<25){
            System.out.println("Ok đó bro");
        }else if (bmi<30){
            System.out.println("hơi thừa cân xíu");
        }else {
            System.out.println("béo phì r cha giảm cân đi");
        }
    }
}
