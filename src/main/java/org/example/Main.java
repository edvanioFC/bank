package org.example;

import account.BankAccount;
import account.DepositAccount;
import account.Holder;
import account.SavingsAccount;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Cria uma nova conta bancária
        BankAccount bankAccount = new BankAccount(123456);

        // Adiciona um titular à conta
        Holder holder = new Holder("Edvanio", 1);
        bankAccount.addHolder(holder);

        // Deposita dinheiro na conta
        bankAccount.deposit(1000);
        System.out.println("Deposited 1000. Current balance: " + bankAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(12345, 20000.0, new Date(), 0.09, 20);
        bankAccount.addSavingsAccount(savingsAccount);

        // Retira dinheiro da conta
        bankAccount.withdraw(200);
        System.out.println("Withdrew 200. Current balance: " + bankAccount.getBalance());
        System.out.println("Demand account balance: " + bankAccount.getDemandAccountBalance());
        System.out.println("Savings account number: " + bankAccount.getSavingsAccounts().get(0).getAccountNumber());
    }
}
