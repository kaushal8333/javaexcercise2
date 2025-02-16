package day6;

import java.util.Comparator;

public class EmployeeComparators {

    public static Comparator<Employee> empidComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getEmpid(), e2.getEmpid());
        }
    };

    public static Comparator<Employee> firstnameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getFirstname().compareTo(e2.getFirstname());
        }
    };
}
