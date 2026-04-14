package com.MoneyTracker;


import java.time.LocalDate;

public class Expense {
    private LocalDate date;
    private double amount;
    private String note;

    public Expense(double amount, String note) {
        this.date = LocalDate.now(); // auto current date
        this.amount = amount;
        this.note = note;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return date + " | ₹" + amount + " | " + note;
    }
}