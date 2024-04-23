package account;
import comparator.AccountComparator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Edvanio Correia
 * @version 1.0
 * This class represents a bank account.
 * It includes methods to manage holders, savings accounts, and a demand account.
 */
public class BankAccount implements Comparable<BankAccount> {
    private int accountNumber;
    private List<Holder> holders;
    private DemandAccount demandAccount;
    private List<SavingsAccount> savingsAccounts;

    /**
     * Constructs a new BankAccount with the given account number.
     * Initializes the holders and savingsAccounts lists and the demandAccount.
     * @param accountNumber the account number
     */
    public BankAccount(int accountNumber){
        this.accountNumber= accountNumber;
        this.holders = new ArrayList<>();
        this.savingsAccounts = new ArrayList<>();
        this.demandAccount = new DemandAccount(this.accountNumber,0.0, new Date());
    }

    /**
     * Returns the account number.
     * @return the account number
     */
    public int getAccountNumber(){
        return accountNumber;
    }

    /**
     * Adds a holder to the holders list and prints a success message.
     * @param holder the holder to add
     */
    public void addHolder(Holder holder){
        holders.add(holder);
        System.out.println("Holder successfully added!");
    }

    /**
     * Returns the holders list.
     * @return the holders list
     */
    public List<Holder> getHolders(){
        return holders;
    }

    /**
     * Adds a savings account to the savingsAccounts list and prints a success message.
     * @param savingsAccount the savings account to add
     */
    public void addSavingsAccount(SavingsAccount savingsAccount){
        savingsAccounts.add(savingsAccount);
        System.out.println("SavingsAccount successfully added!");
    }

    /**
     * Returns the savingsAccounts list.
     * @return the savingsAccounts list
     */
    public List<SavingsAccount> getSavingsAccounts(){
        return savingsAccounts;
    }

    /**
     * Deposits the given amount to the demand account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount)  {
        demandAccount.deposit(amount);
    }

    /**
     * Withdraws the given amount from the demand account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        demandAccount.withdraw(amount);
    }

    /**
     * Returns the balance of the demand account.
     * @return the balance of the demand account
     */
    public double getDemandAccountBalance() {
        return demandAccount.getBalance();
    }

    /**
     * Returns the total balance of the demand account and all savings accounts.
     * @return the total balance
     */
    public double getBalance() {
        double totalBalance = demandAccount.getBalance();
        for (SavingsAccount savingsAccount : savingsAccounts) {
            totalBalance += savingsAccount.getBalance();
        }
        return totalBalance;
    }

    /**
     * Returns the savingsAccounts list.
     * @return the savingsAccounts list
     */
    public List<SavingsAccount> listSavingsAccounts() {
        return savingsAccounts;
    }

    /**
     * Checks if the bank account can be removed.
     * A bank account can be removed if its total balance is zero.
     * @return true if the bank account can be removed, false otherwise
     */
    public boolean canBeRemoved()  {
        return getBalance() == 0;
    }

    /**
     * Compares this bank account with the specified bank account for order.
     * Returns a negative integer, zero, or a positive integer as this bank account's account number
     * is less than, equal to, or greater than the specified bank account's account number.
     * @param o the bank account to be compared
     * @return a negative integer, zero, or a positive integer as this bank account's account number
     * is less than, equal to, or greater than the specified bank account's account number
     */
    @Override
    public int compareTo(BankAccount o) {
        return Integer.compare(accountNumber, o.getAccountNumber());
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * The result is true if and only if the argument is not null and is a BankAccount object that
     * represents the same account number as this object.
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (getClass() != obj.getClass()))  return false;
        BankAccount ba = (BankAccount) obj;
        AccountComparator comparator = new AccountComparator();
        return comparator.compare(this, ba) == 0;
    }
}