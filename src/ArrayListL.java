import java.util.ArrayList;

public class ArrayListL {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kostia");
        arrayList1.add("Vlad");
        arrayList1.add("Sever");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList1 == arrayList2);
    }
}
