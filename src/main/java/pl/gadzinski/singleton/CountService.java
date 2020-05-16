package pl.gadzinski.singleton;

public class CountService {
    private static CountService instance;

    private CountService() {
    }

    public synchronized static CountService instanceOf(){
        if(instance==null){
            System.out.println("Created count service");
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
