package lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Kostia", 'm', 21, 4, 9.2);
        Student st2 = new Student("Vlad", 'm', 21, 2, 10.4);
        Student st3 = new Student("Mariya", 'f', 19, 3, 8.8);
        Student st4 = new Student("Sever", 'm', 22, 1, 6.4);
        Student st5 = new Student("Lera", 'f', 21, 4, 7.6);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);

        StudentInfo info = new StudentInfo();
        info.printStudentOverRate(arrayList, 9);
        info.printStudentUnderAge(arrayList, 20);
        info.printStudentMixComdition(arrayList, 20, 8, 'f');
        info.testStudents(arrayList, (Student s) -> {return s.age < 25;});
        System.out.println("-----------------");
        info.testStudents(arrayList, s -> s.avgRate > 8); // короткий вариант записи
        System.out.println("-----------------");
        info.testStudents(arrayList, (Student s) -> {return s.age >18 && s.sex == 'f';});
    }
    void testStudents (ArrayList<Student> al, StudentChecks sc){
        for (Student s:al){
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }
    void printStudentOverRate(ArrayList<Student> al, double rate){
        for (Student s: al) {
            if(s.avgRate > rate){
                System.out.println(s);
            }
        }
        System.out.println("");
    }
    void printStudentUnderAge(ArrayList<Student> al, int age){
        for (Student s: al) {
            if(s.age < age){
                System.out.println(s);
            }
        }
        System.out.println("");
    }
    void printStudentMixComdition(ArrayList<Student> al, int age, double rate, char sex){
        for (Student s: al) {
            if(s.age > age && s.avgRate < rate && s.sex == sex){
                System.out.println(s);
            }
        }
        System.out.println("");
    }
}
interface StudentChecks {
    boolean check(Student s);
}
