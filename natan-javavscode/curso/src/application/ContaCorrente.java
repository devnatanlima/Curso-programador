package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ContaCorrente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria account;


        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc. nextDouble();
            account = new ContaBancaria(holder, number, initialDeposit);

        }

        else {
            account = new ContaBancaria(holder, number);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account);


         System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(account);


       

        sc.close();
    }
}
