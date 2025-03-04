package com.ig.ui;

import com.ig.model.Scholar;
import com.ig.service.ScholarService;
import com.ig.service.ScholarServiceImpl;
import com.ig.exception.ScholarNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws SQLException, ScholarNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ScholarService service = new ScholarServiceImpl();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n-----------Scholar Management System-----------");
            System.out.println("1. Add Scholar");
            System.out.println("2. Get Scholar by ID");
            System.out.println("3. List All Scholars");
            System.out.println("4. Update Scholar Email");
            System.out.println("5. Delete Scholar");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Scholar ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Mobile: ");
                    String mobile = scanner.nextLine();
				service.addScholar(new Scholar(id, name, email, mobile));
				System.out.println("Scholar added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Scholar ID: ");
                    int searchId = scanner.nextInt();
				Scholar scholar = service.GetOneScholar(searchId);
				System.out.println(scholar);
                    break;
                case 3:
				List<Scholar> scholars = service.listAllScholars();
				scholars.forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Enter Scholar ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Email: ");
                    String newEmail = scanner.nextLine();
				service.updateScholarEmail(updateId, newEmail);
				System.out.println("Email updated successfully!");
                    break;
                case 5:
                    System.out.print("Enter Scholar ID: ");
                    int deleteId = scanner.nextInt();
				service.deleteScholarById(deleteId);
				System.out.println("Scholar deleted successfully!");
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}