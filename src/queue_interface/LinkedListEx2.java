package queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx2 {

    // Queue - это коллекция, хранящая последовательность элементов.
    // Добавляется элемент в конец очереди, используется из начала очереди - правило FIFO.
    // Класс LinkedList имплементирует не только интерфейс List, но и интерфейс Deque.

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Kostia");
        queue.add("Sever");
        queue.offer("Vlad");
        queue.offer("George");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
