package com.ig.ui;

import com.ig.service.AccountService;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        AccountService service = new AccountService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Get Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 4) break;

            System.out.print("Enter Account Number: ");
            int accNumber = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Deposit Amount: ");
                        float depositAmt = sc.nextFloat();
                        service.deposit(accNumber, depositAmt);
                        break;
                    case 2:
                        System.out.print("Enter Withdrawal Amount: ");
                        float withdrawAmt = sc.nextFloat();
                        service.withdraw(accNumber, withdrawAmt);
                        break;
                    case 3:
                        System.out.println("Current Balance: " + service.getBalance(accNumber));
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
