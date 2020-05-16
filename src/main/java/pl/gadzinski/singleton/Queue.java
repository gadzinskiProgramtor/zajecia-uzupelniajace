package pl.gadzinski.singleton;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    private static Queue instance = new Queue();

    public static Queue instanceOf(){

        return instance;
    }


    private List<String> names;

    public Queue() {
        this.names = new LinkedList<>();
    }

    public void push(String name){
        this.names.add(name);
    }
    public String pop(){
        if(this.names.isEmpty()){
            throw  new RuntimeException("Queue is empty");
        }else {
            String value = this.names.get(0);
            this.names.remove(0);
        return value;
        }

    }
}
