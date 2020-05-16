package pl.gadzinski.prototype;

import pl.gadzinski.singleton.Queue;

public class PrototypeApplication {
    public static void main(String[] args) {
        QueuePrototypeEnum.A.push("one");
        QueuePrototypeEnum.B.push("two");
        QueuePrototypeEnum.C.push("three");

        QueuePrototypeEnum.A.pop();

        QueuePrototype.instanceOf(0).push("Michal");
        QueuePrototype.instanceOf(0).push("Marcin");
        QueuePrototype.instanceOf(1).push("Marta");
        QueuePrototype.instanceOf(2).push("Julia");

        System.out.println();


    }

}
