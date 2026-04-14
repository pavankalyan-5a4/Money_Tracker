package com.MoneyTracker;

import java.util.*;


public class ExpenseTracker {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(double amount, String note) {
        expenses.add(new Expense(amount, note));
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses yet.");
            return;
        }

        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public void showTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        System.out.println("Total: ₹" + total);
    }
}