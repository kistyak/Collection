package queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {

        // Deque - double ended queue (двунаправленная очередь).
        // В такой очереди элементы могут использоваться с обоих концов.
        // Интерфейс Deque реализуется классами LinkedList и ArrayDeque.

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addLast(2);
        deque.offerFirst(7);
        deque.offerLast(3);

        System.out.println(deque);
    }
}
