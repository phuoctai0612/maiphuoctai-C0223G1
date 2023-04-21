package test_bai_thi_module_2;

public class Bai2 {
    public static String A(int num) {
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        int index = 0;
        if (num < 10000 && num > 999) {
            a += num;
            char min = a.charAt(0);
            for (int i = 1; i < a.length(); i++) {
                if (min > a.charAt(i)) {
                    min = a.charAt(i);
                    index = i;
                }
            }
            for (int i = 0; i < a.length(); i++) {
                if (i != index) {
                    b += a.charAt(i);
                }
            }
            int count=0;
            int count1=0;
            String []temp=new String[b.length()];
            char max=b.charAt(0);
            for (int i = 1; i < temp.length; i++) {
               if (max<b.charAt(i)){
                   max=b.charAt(i);
                   count=i;
               }
            }
            c+=b.charAt(count);
            for (int i = 0; i < c.length(); i++) {
                if (i!=count){
                    d+=b.charAt(i);
                }
            }
            char max1=d.charAt(0);
            for (int i = 1; i < d.length(); i++) {
                if (max1<d.charAt(i)){
                    max1=d.charAt(i);
                    count1=i;
                }
            }
            c+=d.charAt(count1);
            for (int i = 0; i < d.length(); i++) {
                if (i!=count1){
                   c+=d.charAt(i);
                }
            }
            return c;
        }
        return "Khong co";
    }
    public static void main(String[] args) {
        System.out.println(Bai2.A(4576));
    }
}
