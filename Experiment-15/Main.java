import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private double cgpa;

    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Arun", 8.7);
        String fileName = "student.ser";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);
            objectOutputStream.close();

            System.out.println("Serialization successful.");

            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(fileInputStream);

            Student deserializedStudent =
                    (Student) objectInputStream.readObject();

            objectInputStream.close();

            System.out.println("Deserialization successful.");
            System.out.println("\nDeserialized Student Details:");
            deserializedStudent.display();
        } catch (IOException e) {
            System.out.println("File operation error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Student class not found.");
        }
    }
}
