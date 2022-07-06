package map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {

        // LinkedHashMap является наследником HashMap.
        // Хранит информацию о порядке добавления элементов или порядке их использования.
        // Производительность методов немного ниже, чем у методов HashMap.

        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Kostia", "Servetnyk", 4);
        Student st2 = new Student("Vlad", "Vlados", 1);
        Student st3 = new Student("Sever", "Server", 3);
        Student st4 = new Student("Igor", "Petrov", 4);

        lhm.put(9.2, st2);
        lhm.put(8.6, st3);
        lhm.put(4.7, st4);
        System.out.println(lhm);
        System.out.println(lhm.get(8.6));
        lhm.put(5.4, st1);
        System.out.println(lhm);
    }
}
