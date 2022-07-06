package set_interface;

import java.util.HashSet;
import java.util.Set;

public class TreeSetEx {
    public static void main(String[] args) {

        // TreeSet хранит элементы в отсортиированом по возрастанию порядке.
        // В основе TreeSet лежит TreeMap. У элементов данного TreeMap: ключи - это элементы TreeSet,
        // значения - это константа-заглушка.

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(6);

        System.out.println(set);
    }
}
