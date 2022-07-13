package lambda;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgRate;

    public Student(String name, char sex, int age, int course, double avgRate) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgRate = avgRate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgRate=" + avgRate +
                '}';
    }
}
