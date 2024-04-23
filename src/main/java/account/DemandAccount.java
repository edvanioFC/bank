package account;

import java.util.Date;
/**
 * @author Edvanio Correia
 * @version 1.0
 * This class represents a demand account.
 * It extends the DepositAccount class and includes methods to deposit and withdraw money.
 */
public class DemandAccount extends DepositAccount {
    /**
     * Constructs a new DemandAccount with the given account number, balance and start date.
     * @param accountNumber the account number
     * @param balance the initial balance
     * @param startDate the start date of the account
     */
    public DemandAccount(int accountNumber, double balance, Date startDate) {
        super(accountNumber, balance, startDate);
    }

    /**
     * Deposits the given amount to the account.
     * @param amount the amount to deposit
     * @throws IllegalArgumentException if the amount is negative or zero
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative ou equal to zero ");
        }
        super.balance += amount;
    }

    /**
     * Withdraws the given amount from the account.
     * @param amount the amount to withdraw
     * @throws IllegalArgumentException if the amount is negative or greater than the balance
     */
    public void withdraw(double amount) {
        if (amount < 0 || amount > super.balance) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        super.balance -= amount;
    }
}
