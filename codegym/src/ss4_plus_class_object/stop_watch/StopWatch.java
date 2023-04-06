package ss4_plus_class_object.stop_watch;

public class StopWatch {
    public long startTime, endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime=System.currentTimeMillis();
    }
    public void star(){
        this.startTime=System.currentTimeMillis();
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
