package collections;
import java.util.*;
public class List2 {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        // Add employees
        db.addEmployee(new Employee(101, "Alice", "alice@example.com", "Female", 50000));
        db.addEmployee(new Employee(102, "Bob", "bob@example.com", "Male", 60000));
        db.addEmployee(new Employee(103, "Charlie", "charlie@example.com", "Male", 55000));

        // Show payslip
        System.out.println(db.showPaySlip(102));

        // Display all employees
        System.out.println("\nAll Employees:");
        db.displayAllEmployees();

        // Delete an employee
        db.deleteEmployee(102);

        // Display all employees after deletion
        System.out.println("\nAfter deletion of Employee ID 102:");
        db.displayAllEmployees();
    }
}