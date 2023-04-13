package Test;

public class ASS {
    boolean solution(int[] a) {
        if(a.length<=3){
            return false;
        }
        int count=0;
        int count1=0;
        for(int i=0;i<a.length;i++){
            count+=a[i];
        }
        for(int j=0;j<a.length;j++){
            count-=a[j];

            if(count==count1){
                return true;
            }
            count1+=a[j];
        }
        return false;
    }

    public static void main(String[] args) {
        ASS a=new ASS();
        System.out.println(a.solution(new int[]{1, 2, 3, 3,6,9}));
    }
}
