package day2;

public class Student {
    int rollno;
    String fname;
   
	public Student(int rollno, String fname) {
		super();
		this.rollno = rollno;
		this.fname = fname;
	}
	public void modify(int value) {
        value = value + 1;  
    }
    public void modify(Student student) {
        student.rollno = student.rollno + 1;  
    }
    public void modify(String newFname) {
        this.fname = newFname;  
    }

    @Override
    public String toString() {
        return "Student{rollno=" + rollno + ", fname='" + fname + "'}";
    }
}
