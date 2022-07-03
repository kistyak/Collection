import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        System.out.print(list + " - is ");
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        while (iterator.hasNext() && reIterator.hasPrevious()){
            if (iterator.next() != reIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        // Проверяет следующие и предыдущие элементы list
        if (isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
