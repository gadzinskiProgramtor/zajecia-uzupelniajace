package pl.gadzinski.singleton;

public class SingletonApplication {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Queue queue2 = new Queue();
        queue.push("Damian");
        queue.push("Tomek");
        queue.push("Sebastian");

        QueueSingletonEnum queueSingletonEnum = QueueSingletonEnum.INSTANCE;

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
