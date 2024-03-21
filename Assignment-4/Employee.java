import java.util.*;

// Employee class
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String designation;
    private double salary;

    
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

  
    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.getName());
    }

    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        
        LinkedList<Employee> employees = new LinkedList<>();

        
        employees.add(new Employee(101, "John", "Manager", 50000));
        employees.add(new Employee(102, "Alice", "Developer", 60000));
        employees.add(new Employee(103, "Bob", "Analyst", 55000));

        
        Collections.sort(employees);

        
        System.out.println("Sorted by name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getSalary(), emp2.getSalary());
            }
        });

        
        System.out.println("\nSorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
