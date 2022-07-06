package set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {

        // Set - коллекция, хранящая уникальные элементы. Методы данной коллекции очень быстры.
        // HashSet не запоминает порядок добавления элементов. В основе HashSet лежит HashMap.
        // У элементов данного HashMap: ключи - это элементы HashSet, значения - это константа-заглушка.

        Set<String> set = new HashSet<>();
        set.add("Kostia");
        set.add("Vlad");
        set.add("George");

        for (String s: set){
            System.out.println(s);
        }

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(4);
        hashSet1.add(9);
        hashSet1.add(1);
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(5);
        hashSet2.add(3);
        hashSet2.add(8);
        hashSet2.add(1);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);
    }
}
