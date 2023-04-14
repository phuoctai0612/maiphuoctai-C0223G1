package ss10_vsa_danh_sach.bai_tap.bai_1;

public class Management {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>();

        myList.add(0, "Tài");
        myList.add(1, "Tính");
        myList.add(2, "Thành");
        myList.add(3, "Nhàn");
        myList.add(4, "Sang");
        myList.add(5, "Huy");
        myList.add(10, "TTT");
        myList.remove("Huy");
        myList.remove("Sang");
        myList.remove("Tài");
        System.out.println(myList.get(0));
        System.out.println(myList.toString());
    }
}
