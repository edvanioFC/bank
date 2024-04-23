package account;
import java.util.Date;

/**
 * @author Edvanio Correia
 * @version 1.0
 * This class represents a savings account.
 * It extends the DepositAccount class and includes methods to get interest rate, duration in days, and close the account.
 */
public class SavingsAccount extends DepositAccount {
    private double interestRate;
    private int durationInDays;
    /**
     * Constructs a new SavingsAccount with the given account number, balance, start date, interest rate, and duration in days.
     * @param accountNumber the account number
     * @param balance the initial balance
     * @param startDate the start date of the account
     * @param interestRate the interest rate of the account
     * @param durationInDays the duration in days of the account
     */
    public SavingsAccount(int accountNumber, double balance, Date startDate, double interestRate, int durationInDays) {
        super(accountNumber, balance, startDate);
        this.interestRate = interestRate;
        this.durationInDays = durationInDays;
    }

    /**
     * Returns the interest rate of the account.
     * @return the interest rate of the account
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Returns the duration in days of the account.
     * @return the duration in days of the account
     */
    public int getDurationInDays() {
        return durationInDays;
    }

    /**
     * Closes the account by depositing the balance into the given bank account and setting the balance to zero.
     * @param bankAccount the bank account to deposit the balance into
     */
    public void closeAccount(BankAccount bankAccount) {
        bankAccount.deposit(balance);
        balance = 0;
    }
}