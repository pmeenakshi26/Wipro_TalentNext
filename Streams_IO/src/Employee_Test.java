import java.io.*;
import java.util.Date;

public class Employee_Test {

    // Employee class (inner class)
    static class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private Date joinDate;
        private String department;
        private String role;
        private double salary;

        public Employee(String name, Date joinDate, String department, String role, double salary) {
            this.name = name;
            this.joinDate = joinDate;
            this.department = department;
            this.role = role;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Name: " + name + "\n"
                 + "Join Date: " + joinDate + "\n"
                 + "Department: " + department + "\n"
                 + "Role: " + role + "\n"
                 + "Salary: " + salary;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Lalitha", new Date(), "CSE", "Developer", 50000.0);

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"))) {
            out.writeObject(emp);
            System.out.println("Employee object has been serialized to 'data' file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
