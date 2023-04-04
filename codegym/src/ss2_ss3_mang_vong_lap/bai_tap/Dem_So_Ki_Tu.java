package ss2_ss3_mang_vong_lap.bai_tap;

public class Dem_So_Ki_Tu {
    public static void main(String[] args) {
        String str="maiphuoctaitttt";
        char cha= 't';
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (cha==str.charAt(i)){
               count++;
            }
        }
        System.out.println(count);
    }
}
