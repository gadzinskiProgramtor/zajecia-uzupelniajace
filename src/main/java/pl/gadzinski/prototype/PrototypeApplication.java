package pl.gadzinski.prototype;

import pl.gadzinski.singleton.Queue;

public class PrototypeApplication {
    public static void main(String[] args) {
        QueuePrototypeEnum.A.push("one");
        QueuePrototypeEnum.B.push("two");
        QueuePrototypeEnum.C.push("three");


    }

}
