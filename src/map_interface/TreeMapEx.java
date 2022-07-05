package map_interface;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        // Элементами TreeMap являются пары ключ/значение.
        // В TreeMap элементы хранятся в отсортированом по возрастанию порядке.
        // В основе TreeMap лежит красно-черное дерево. Это позволяет методам работать быстро,
        // но не быстрее, чем методы HashMap.

        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Kostia", "Servetnyk", 4);
        Student st2 = new Student("Vlad", "Vlados", 1);
        Student st3 = new Student("Sever", "Server", 3);
        Student st4 = new Student("Igor", "Petrov", 4);
        Student st5 = new Student("Mariya", "Ivanova", 1);
        Student st6 = new Student("Ivan", "Sidorov", 3);
        Student st7 = new Student("Elena", "Sidorova", 3);
        treeMap.put(7.8, st1);
        treeMap.put(6.6, st7);
        treeMap.put(4.4, st3);
        treeMap.put(9.2, st2);
        treeMap.put(5.5, st5);
        treeMap.put(8.2, st6);
        treeMap.put(6.8, st4);

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.get(7.8));
        System.out.println(treeMap.tailMap(7.0));

        TreeMap<Student, Double> treeMap2 = new TreeMap<>();
        treeMap2.put(st1, 9.6);
        treeMap2.put(st2, 9.2);
        treeMap2.put(st3, 7.8);

        System.out.println(treeMap2);
    }
}
