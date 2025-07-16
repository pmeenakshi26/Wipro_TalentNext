
import java.util.*;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employees extends Person {
	
	private double annualSalary;
	private int yearStarted;
	private String nationalInsuranceNumber;

	public Employees(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
		super(name);
		this.annualSalary = annualSalary;
		this.yearStarted = yearStarted;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getYearStarted() {
		return yearStarted;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public void setYearStarted(int yearStarted) {
		this.yearStarted = yearStarted;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public void displayInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Annual Salary: $" + annualSalary);
		System.out.println("Year Started: " + yearStarted);
		System.out.println("National Insurance Number: " + nationalInsuranceNumber);
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp = new Employees("John Doe", 75000.0, 2015, "NI123456A");

		emp.displayInfo();

		emp.setAnnualSalary(80000.0);
		emp.setName("John D.");

		System.out.println("\nUpdated Information:");
		emp.displayInfo();
	}
}