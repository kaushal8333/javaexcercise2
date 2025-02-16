package day6;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
	Employee emp1 = new Employee(101, "Alice", "Smith");
    Employee emp2 = new Employee(102, "Bob", "Johnson");
    Employee emp3 = new Employee(103, "Charlie", "Williams");
    Employee emp4 = new Employee(104, "David", "Brown");
    Employee emp5 = new Employee(105, "Eve", "Jones");
    Employee emp6 = new Employee(106, "Alice", "Taylor"); 
    Employee emp7 = new Employee(101, "Alice", "Smith"); 

    Set<Employee> empSet = new TreeSet<>();
    
    empSet.add(emp1);
//    employeesByEmpid.add(emp1);
//    employeesByEmpid.add(emp2);
//    employeesByEmpid.add(emp3);
//    employeesByEmpid.add(emp4);
//    employeesByEmpid.add(emp5);
//    employeesByEmpid.add(emp6);
//    employeesByEmpid.add(emp7); 

    System.out.println("Employees sorted by empid:");
    for (Employee emp : employeesByEmpid) {
        System.out.println(emp);
    }

    Set<Employee> employeesByFirstname = new TreeSet<>(EmployeeComparators.firstnameComparator);
    employeesByFirstname.add(emp1);
    employeesByFirstname.add(emp2);
    employeesByFirstname.add(emp3);
    employeesByFirstname.add(emp4);
    employeesByFirstname.add(emp5);
    employeesByFirstname.add(emp6);
    employeesByFirstname.add(emp7); 

    System.out.println("\nEmployees sorted by firstname:");
    for (Employee emp : employeesByFirstname) {
        System.out.println(emp);
    }
}
}
