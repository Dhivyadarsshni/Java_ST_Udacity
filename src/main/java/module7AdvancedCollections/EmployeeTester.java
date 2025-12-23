package module7AdvancedCollections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTester {

    public static void main(String[] args) {

        Set<Employee> employees = new HashSet<>();

        Employee e1 = new Employee(101, "Dhivs", "dhivs@gmail.com");
        Employee e2 = new Employee(101, "Darsshni", "dhivs@gmail.com");

        Employee e3 = new Employee(102,"Darsh","darshh16@gmail.com");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("Total Employees: " + employees.size());
    }
}

