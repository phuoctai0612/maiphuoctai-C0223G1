package ss15_exception.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Nhập vào độ dài cạnh thứ nhất: ");
            a = scanner.nextDouble();
            System.out.print("Nhập vào độ dài cạnh thứ hai: ");
            b = scanner.nextDouble();
            System.out.print("Nhập vào độ dài cạnh thứ ba: ");
            c = scanner.nextDouble();
            validateTriangle(a,b,c);
        } catch (InputMismatchException t) {
            System.err.println("Lỗi không đc nhập chữ "+t.toString());
            t.printStackTrace();
        } catch (Management e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }

    public static void validateTriangle(double a, double b, double c) throws Management {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Management("Các cạnh tam giác phải là số dương");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Management("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
    }
}

