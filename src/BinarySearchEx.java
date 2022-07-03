import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchEx {
    public static void main(String[] args) {

        // Binary Search - метод класса Collections
        // Пример сортировки списка и поиска 16
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(54);
        arrayList.add(2);
        arrayList.add(16);
        arrayList.add(-10);
        arrayList.add(-32);
        arrayList.add(9);
        arrayList.add(-2);
        arrayList.add(12);
        arrayList.add(5);
        arrayList.add(14);
        Collections.sort(arrayList);
        int index1 = Collections.binarySearch(arrayList, 16);
        System.out.println(index1);

        Employee emp1 = new Employee(47, "Kostia", 12342);
        Employee emp2 = new Employee(115, "Vlad", 3456);
        Employee emp3 = new Employee(47, "Sever", 2361);
        Employee emp4 = new Employee(96, "Denis", 10564);
        Employee emp5 = new Employee(54, "George", 500);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        System.out.println(employeeList);

        // Сортирует по id ил name если id повторяется
        Collections.sort(employeeList);
        System.out.println(employeeList);

        // Ищет работника {54, George, 500}
        int index2 = Collections.binarySearch(employeeList
                , new Employee(54, "George", 500));
        // Выводит его индекс из списка
        System.out.println(index2);

        // Пример с Arrays
        int[] arr = {-3, 54, 12, -47, 228, 1, 5, 69};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index3 = Arrays.binarySearch(arr, 54);
        System.out.println(index3);
    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // Для красоты
    @Override
    public String toString() {
        return "{id:" + id + ", name:" + name + ", salary:" + salary + "}";
    }

    // Для сортировки списка работников
    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}