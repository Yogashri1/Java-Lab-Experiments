import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "student.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Student ID: 101");
            bufferedWriter.newLine();
            bufferedWriter.write("Student Name: Arun");
            bufferedWriter.newLine();
            bufferedWriter.write("Department: CSE");
            bufferedWriter.newLine();
            bufferedWriter.write("Percentage: 85.5");

            bufferedWriter.close();

            System.out.println("Student data written successfully.");

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("\nStudent Details from File:");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File operation error: " + e.getMessage());
        }
    }
}
