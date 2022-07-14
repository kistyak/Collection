package stream;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1};
        Arrays.stream(arr).forEach(e -> {e *= 2; System.out.println(e);});
        System.out.println("-------------------------------");
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("-------------------------------");
        Arrays.stream(arr).forEach(Utils::myMethod);
    }
}
class Utils {
    public static void myMethod(int a){
        a = a + 5;
        System.out.println("a = " + a);
    }
}