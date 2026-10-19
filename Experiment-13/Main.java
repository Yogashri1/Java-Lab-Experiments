import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Kumar"));
        students.add(new Student(101, "Arun"));
        students.add(new Student(102, "Priya"));

        System.out.println("Students Before Sorting:");
        System.out.println(students);

        Collections.sort(students);

        System.out.println("\nStudents Sorted by Roll Number:");
        System.out.println(students);

        Collections.sort(students, new NameComparator());

        System.out.println("\nStudents Sorted by Name:");
        System.out.println(students);
    }
}
