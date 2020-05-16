package pl.gadzinski.prototype;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QueuePrototype {
    private static List<QueuePrototype> instance = new ArrayList<>()

    {
        {
            this.add(null);
            this.add(null);
            this.add(null);
        }
    };

    private QueuePrototype() {
        this.names = new LinkedList<>();

    }

    public synchronized static QueuePrototype instanceOf(int index) {
        if (index > 2 || index < 0) {
            return null;
        } else {
            QueuePrototype queuePrototype = instance.get(index);
            if (queuePrototype == null) {
                QueuePrototype element = new QueuePrototype();

                instance.add(index, element);
                return element;
            }
            return queuePrototype;
        }
    }


    private List<String> names;


    public void push(String name) {
        this.names.add(name);
    }

    public String pop() {
        if (this.names.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            String value = this.names.get(0);
            this.names.remove(0);
            return value;
        }
    }
}
