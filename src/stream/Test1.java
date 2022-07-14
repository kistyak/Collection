package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);

        int[] array = {2, 4, 1, 8, 5};
        array = Arrays.stream(array).map(e -> {if (e% 2 == 0){
        e = e/2;}
            return e;}).toArray();
        System.out.println(Arrays.toString(array));
    }
}
