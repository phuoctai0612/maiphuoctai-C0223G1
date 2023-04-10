package ss5_accessmodifier.ThucPham;

import java.util.Scanner;

public class TestThucPham {
    public static void main(String[] args) {
        ThucPham tp = new ThucPham(052, "BCS", 15, 22, 5000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn có muốn thêm hàng bán không : \"có\" hoặc \" không\"");
        String test = sc.nextLine();
        if (test.equals("có")) {
            System.out.println("nhập tên hàng");
            String setHang = sc.nextLine();
            if (setHang.equals("")) {
                System.out.println("cần nhập tên hàng");
                return;
            }

            System.out.println("nhập ngày sản xuất");
            int setNgay = Integer.parseInt(sc.nextLine());
            if ((setNgay*1)==0){
                System.out.println("nhập đúng ngày sản xuất vào");
                return;
            }
            System.out.println("nhập ngày hết hạn");
            int setCuoi = Integer.parseInt(sc.nextLine());
            System.out.println("nhập giá");
            double setGia = Double.parseDouble(sc.nextLine());
            if (setGia<0){
                System.out.println("nhập đúng giá vào");
                return;
            }
            tp.setTenHang(setHang);
            tp.setNsx(setNgay);
            tp.setNhh(setCuoi);
            tp.setDonGia(setGia);
            System.out.println(tp.toString());
            if (tp.kiemTra() > 0) {
                System.out.println("Còn " + tp.kiemTra() + " ngày để sử dụng");
            } else {
                System.out.println("hết hạn sử dụng rồi");
            }
        } else if (test.equals("không")) {
            System.out.println("rứa thôi");
        } else {
            System.out.println("khôn hiểu");
        }
    }
}
