package day6;

import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Address address1 = new Address("street1", "city1", "code1");
        Address address2 = new Address("street2", "city3", "code2");
        Address address3 = new Address("street1", "city1", "code1"); 

        Student student1 = new Student("first", "last", 20, address1);
        Student student2 = new Student("first1", "last1", 22, address2);
        Student student3 = new Student("first1", "last1", 20, address1); 
        Student student4 = new Student("first2", "last2", 20, address3); 
        Student student5 = new Student("Alice", "Johnson", 21, address2);

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);

        System.out.println("Students in HashSet:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
