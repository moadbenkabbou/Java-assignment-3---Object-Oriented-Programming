package com.company;

public class Application {
    // main
    public static void main(String[] args) {
        // for calculation of 5% interest
        double firstBalance4, secondBalance4,a, b;
        // instantiating two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        // setting Saver 1 and Saver 2 balances
        saver1.setSavingsBalance(2000.0);
        saver2.setSavingsBalance(3000.0);
        // setting interest rate to 4 %
        saver1.setAnnualInterestRate(0.04);
        saver2.setAnnualInterestRate(0.04);

        // save balances to prevent long codes
        firstBalance4 = (saver1.calculateMonthlyInterest(saver1.getSavingsBalance(), SavingsAccount.getAnnualInterestRate())*12)
                + saver1.getSavingsBalance();
        secondBalance4 = (saver2.calculateMonthlyInterest(saver2.getSavingsBalance(), SavingsAccount.getAnnualInterestRate())*12)
                + saver2.getSavingsBalance();

        // balance with current interest rate
        System.out.print("With 4 % interest rate, these are the new balances after 12 months. \nSaver 1: ");
        System.out.printf("%.2f", firstBalance4);
        System.out.print("\nSaver 2: ");
        System.out.printf("%.2f", secondBalance4);

        // initializing a
        a = (((saver1.calculateMonthlyInterest(saver1.getSavingsBalance(), SavingsAccount.getAnnualInterestRate())*12)
                + saver1.getSavingsBalance()));
        // initializing b
        b = (((saver2.calculateMonthlyInterest(saver2.getSavingsBalance(), SavingsAccount.getAnnualInterestRate())*12)
                + saver2.getSavingsBalance()));

        // modifying interest rate and saving the new monthly interest (5%) into "a"
        a = a * (saver1.modifyInterestRate(SavingsAccount.getAnnualInterestRate())/12);
        // modifying interest rate and saving the new monthly interest (5%) into "b"
        b = b * (SavingsAccount.getAnnualInterestRate()/12);

        // next month's balance with current interest rate from savers' initial balance
        System.out.print("\n\nWith 5 % interest rate, next month balances are listed below (Month 13). \nSaver 1: ");
        System.out.printf("%.2f", (firstBalance4 + a));
        System.out.print("\nSaver 2: ");
        System.out.printf("%.2f", (secondBalance4 + b));
    }
}

// class Savings Account
class SavingsAccount{
    private double savingsBalance;
    private static double annualInterestRate;

    // getter for annualInterestRate
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    // setter for annualInterestRate
    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }


    // method to calculate MPR
    public double calculateMonthlyInterest(double balance, double rate)
    {
        double monthlyInterest;
        monthlyInterest = (balance*rate)/12;
        return monthlyInterest;
    }

    // method to change rate
    public static double modifyInterestRate(double x){
        setAnnualInterestRate(x + 0.01);
        return getAnnualInterestRate();
    }

    // getter for savingsBalance
    public double getSavingsBalance() {
        return savingsBalance;
    }
    // setter for savingsBalance
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
