package map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Kostia", "Servetnyk", 4);
        Student st2 = new Student("Vlad", "Vlados", 1);
        Student st3 = new Student("Sever", "Server", 3);
        map.put(st1, 6.5);
        map.put(st2, 9.2);
        map.put(st3, 7.8);
        System.out.println(map);

        Student st4 = new Student("Sever", "Server", 3);
        boolean result = map.containsKey(st4);
        System.out.println(result);

        for (Map.Entry<Student, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{name = " + name + " " + surname + ", course = " + course + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}