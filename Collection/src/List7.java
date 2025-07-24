
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

// Employee class
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

// Main class
public class List7 {

    public static void main(String[] args) {
        // Create a Vector that stores Employee objects
        Vector<Employee> empVector = new Vector<>();

        // Add Employee objects to the Vector
        empVector.add(new Employee(101, "Alice", 50000));
        empVector.add(new Employee(102, "Bob", 55000));
        empVector.add(new Employee(103, "Charlie", 60000));

        // Using Iterator
        System.out.println("Employees using Iterator:");
        Iterator<Employee> it = empVector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Using Enumeration
        System.out.println("\nEmployees using Enumeration:");
        Enumeration<Employee> en = empVector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}