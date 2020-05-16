package pl.gadzinski.singleton;

public class SingletonApplication {
    public static void main(String[] args) {
        Queque queque = new Queque();
        Queque queque2 = new Queque();
        queque.push("Damian");
        queque.push("Tomek");
        queque.push("Sebastian");

        System.out.println(queque.pop());
        System.out.println(queque.pop());
        System.out.println(queque.pop());
        System.out.println(queque.pop());
    }
}
