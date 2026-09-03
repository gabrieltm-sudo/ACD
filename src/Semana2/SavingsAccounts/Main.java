// import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SavingsAccount savingAccount1 = new SavingsAccount(2000);
        SavingsAccount savingAccount2 = new SavingsAccount(3000);
        
        savingAccount1.calculateMonthlyInterest();
        savingAccount2.calculateMonthlyInterest();

        System.out.printf("%.2f\n", savingAccount1.getSavingsBalance());
        System.out.printf("%.2f\n", savingAccount2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.5);

        savingAccount1.calculateMonthlyInterest();
        savingAccount2.calculateMonthlyInterest();

        System.out.printf("%.2f\n", savingAccount1.getSavingsBalance());
        System.out.printf("%.2f\n", savingAccount2.getSavingsBalance());

    }
}
