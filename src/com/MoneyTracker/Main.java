package com.MoneyTracker;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseTracker tracker = new ExpenseTracker();

        while (true) {
            System.out.println("\n=== Expense Tracker ===");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Total");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter short note: ");
                    String note = sc.nextLine();

                    tracker.addExpense(amount, note);
                    System.out.println("Saved!");
                    break;

                case 2:
                    tracker.viewExpenses();
                    break;

                case 3:
                    tracker.showTotal();
                    break;

                case 4:
                    System.out.println("Bye!");
                    return;
            }
            sc.close();
        }
    }
}