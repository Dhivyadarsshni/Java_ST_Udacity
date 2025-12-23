package module7AdvancedCollections;

import java.util.Objects;

public class Employee {

    private int empId;
    private String name;
    private String email;

    public Employee(int empId, String name, String email) {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }

    /*
     * equals():
     * Checks logical equality of Employee objects.
     * Two employees are equal if empId and email are same.
     */
    @Override
    public boolean equals(Object obj) {

        // Same memory reference
        if (this == obj) return true;

        // Null or different class
        if (obj == null || getClass() != obj.getClass()) return false;

        // Type casting
        Employee employee = (Employee) obj;

        return empId == employee.empId &&
                email.equals(employee.email);
    }

    /*
     * hashCode():
     * Generates hash based on empId and email.
     * Used by HashSet / HashMap to find bucket.
     */
    @Override
    public int hashCode() {
        return Objects.hash(empId, email);
    }
}

