package pl.gadzinski.singleton;

public class CountService {
    private static CountService instance;

    private CountService() {
    }

    public static CountService instanceOf(){
        if(instance==null){
            instance = new CountService();
        }
        return instance;
    }

    private Integer count=0;

    public synchronized void increment() {
        this.count =this.count +1;
    }

    public Integer getCount() {
        return count;
    }
}
