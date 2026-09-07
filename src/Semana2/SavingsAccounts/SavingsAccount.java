// package Semana2.SavingsAccounts;

public class SavingsAccount {
    private static double annualInterestRate = 0.4;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){
        this.savingsBalance = this.savingsBalance * annualInterestRate/12;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
    
    public static void modifyInterestRate(double newValue){
        annualInterestRate = newValue;
    }
}