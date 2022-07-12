package queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        // PriorityQueue - это специальный вид очереди, в котором используется натуральная сортировка или та,
        // которую мы описываем с помощью Comparable или Comparator. Таким образом используется тот элемент из
        // очереди, приоритет которого выше.

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(6);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(5);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
    }
}
