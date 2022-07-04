package map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        // Элементами HashMap являются пары ключ/значение.
        // HashMap не запоминает порядок добавления элементов.
        // Его методы работают очень быстро.
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2314, "Kostia Servetnyk");
        map1.put(4373, "Vlad Vados");
        map1.put(1235, "George Cooney");
        map1.put(2341, "Sever Slayer");
        System.out.println(map1);
        System.out.println(map1.get(2314));
        map1.remove(1235);
        System.out.println(map1.get(1235));
        System.out.println(map1.containsValue("Kostia Servetnyk"));
        System.out.println(map1.containsKey(3453));
        System.out.println(map1.keySet());

        // keySet() - возвращает множество ключей
        // values() - возвращает множество значений
    }
}
