package set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {

        // LinkedHashSet является наследником HashSet. Хранит информацию о порядке добавления элементов.
        // Производительность методов намного ниже, чем у методов HashSet.
        // В основе LinkedHashSet лежит HashMap. У элементов данного HashMap: ключи - это элементы TreeSet,
        // значения - это константа-заглушка.

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(47);
        lhs.add(54);
        lhs.add(12);
        System.out.println(lhs);
    }
}
