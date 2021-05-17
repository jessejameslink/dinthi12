package b4_classAndMethods;

public class stopWatch { private long starTime;
    private long endTime;

    public stopWatch() {
        this.starTime =  System.currentTimeMillis();

    }

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public  void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getTime(){
        return (endTime - starTime);
    }
}