package day6;

public class Employee {
    private int empid;
    private String firstname;
    private String lastname;

    public Employee(int empid, String firstname, String lastname) {
        this.empid = empid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{empid=" + empid + ", firstname='" + firstname + "', lastname='" + lastname + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empid == employee.empid; // Employees with same empid are considered duplicates
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(empid);
    }
}
