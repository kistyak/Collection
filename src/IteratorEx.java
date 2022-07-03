import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kostia");
        arrayList1.add("Vlad");
        arrayList1.add("Sever");

        Iterator<String> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Iterator<String> iterator2 = arrayList1.iterator();
        while (iterator2.hasNext()){
            iterator2.next();
            iterator2.remove();
        }
        System.out.println(arrayList1);
    }
}
