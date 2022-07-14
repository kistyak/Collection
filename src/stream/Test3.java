package stream;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((a, e) -> a*e).get();
        System.out.println(result);

        // a = 5 после * 40 80 320 960
        // e = 8          2  4   3

        int result2 = list.stream().reduce(1, (a, e) -> a*e);
        System.out.println(result2);
    }
}
