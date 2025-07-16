
import java.util.Optional;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Optionalclass3 {
    public static void main(String[] args) {
        Employee emp = null; 

        Optional<Employee> optionalEmp = Optional.ofNullable(emp);

        if (optionalEmp.isPresent()) {
            System.out.println("Employee name: " + optionalEmp.get().getName());
        } else {
            System.out.println("Invalid Employee: Employee is null");
        }
    }
}