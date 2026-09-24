import java.util.Scanner;
import employee.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(employeeId, employeeName, salary);

        employee.displayEmployee();

        scanner.close();
    }
}
