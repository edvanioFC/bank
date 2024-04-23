package account;

import java.util.Date;
/**
 * @author Edvanio Correia
 * @version 1.0
 * This abstract class represents a deposit account.
 * It includes methods to get account number, balance, start date and update balance.
 */
public abstract class DepositAccount {
    private int accountNumber;
    protected double balance;
    private Date startDate;

    /**
     * Constructs a new DepositAccount with the given account number, balance and start date.
     * @param accountNumber the account number
     * @param balance the initial balance
     * @param startDate the start date of the account
     */
    public DepositAccount(int accountNumber, double balance, Date startDate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.startDate = startDate;
    }

    /**
     * Returns the account number.
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returns the balance.
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the start date.
     * @return the start date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Updates the balance with the given interest rate.
     * @param interestRate the interest rate
     */
    public void updateBalance(double interestRate) {
        double interest = balance * interestRate;
        balance += interest;
    }
}
