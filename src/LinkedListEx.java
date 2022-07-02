import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {

        //LinkedList - звенья одной цепи.
        //У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент.

        Student st1 = new Student("Kostia", 21);
        Student st2 = new Student("Sever", 22);
        Student st3 = new Student("Vadim", 20);
        Student st4 = new Student("George", 5);
        Student st5 = new Student("Denis", 18);

        LinkedList<Student> students = new LinkedList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println(students.get(2));

        //Следует использовать когда:
        //1. Невелико количество оперраций получения элементов;
        //2. Велико количество операций добавления и удаления элементов. Особенно если речь идет о элементах в начале колекции.
    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
//Для красоты
    @Override
    public String toString() {
        return "{name:" + name + ", age:" + age + "}";
    }
}
