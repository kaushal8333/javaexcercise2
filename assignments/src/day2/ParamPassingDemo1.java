package day2;
public class ParamPassingDemo1 {

    public static void main(String[] args) {
        int num = 5;
        String name = "mag";
        Student student = new Student(101, "ram");

        System.out.println("Before modify() method calls:");
        System.out.println("Primitive int value: " + num);
        System.out.println("Student object: " + student);
        System.out.println("String value: " + name);

        student.modify(num);

        student.modify(student);

        student.modify("ravi");

        System.out.println("\nAfter modify() method calls:");
        System.out.println("Primitive int value: " + num);  
        System.out.println("Student object: " + student);
        System.out.println("String value: " + name);
    }
}
