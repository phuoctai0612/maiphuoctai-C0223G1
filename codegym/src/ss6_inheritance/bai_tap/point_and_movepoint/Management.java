package ss6_inheritance.bai_tap.point_and_movepoint;

public class Management {
    public static void main(String[] args) {
        Moveablepoint move = new Moveablepoint(1, 2, 3, 4);
        System.out.println(move.toString());
        System.out.println(move.move());
    }
}
