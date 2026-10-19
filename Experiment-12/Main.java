import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();

        studentList.add("Arun");
        studentList.add("Priya");
        studentList.add("Arun");

        System.out.println("Student List: " + studentList);

        Set<String> courseSet = new HashSet<>();

        courseSet.add("Java");
        courseSet.add("Python");
        courseSet.add("Java");

        System.out.println("Course Set: " + courseSet);

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Arun");
        studentMap.put(102, "Priya");
        studentMap.put(103, "Kumar");

        System.out.println("Student Map:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey()
                    + ", Student Name: " + entry.getValue());
        }

        Queue<String> studentQueue = new LinkedList<>();

        studentQueue.offer("Arun");
        studentQueue.offer("Priya");
        studentQueue.offer("Kumar");

        System.out.println("Queue Before Processing: " + studentQueue);

        String processedStudent = studentQueue.poll();
        System.out.println("Processed Student: " + processedStudent);

        System.out.println("Queue After Processing: " + studentQueue);
    }
}
