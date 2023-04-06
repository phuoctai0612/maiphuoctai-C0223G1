package ss4_plus_class_object.stop_watch;

import ss4_plus_class_object.stop_watch.StopWatch;

public class StopWatchManagement {
    public static void main(String[] args) {
        StopWatch st=new StopWatch();
        st.star();
        System.out.println(st.getStartTime());
        for (int i = 0; i < 1000000000; i++) {
        }
        st.stop();
        System.out.println(st.getEndTime());
        System.out.println(st.getElapsedTime());
    }
}
