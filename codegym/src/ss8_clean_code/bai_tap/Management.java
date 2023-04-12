package ss8_clean_code.bai_tap;

import java.util.Arrays;

public class Management {
    public static void main(String[] args) {
        TennisGame t = new TennisGame("Tai", "Thuan");
        TennisGameTest t1 = new TennisGameTest((int) Math.floor(Math.random() * 16), (int) Math.floor(Math.random() * 16), "...");
        System.out.println(t.toString());
        System.out.println(t1.toString());
        t1.checkAllScores();
    }
}
