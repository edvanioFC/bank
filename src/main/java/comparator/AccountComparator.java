package comparator;

import account.BankAccount;
import java.util.Comparator;

/**
 * @author Edvanio Correia
 * @version 1.0
 * This class implements Comparator for the BankAccount class.
 * It is used to compare two BankAccount objects based on their account number.
 */
public class AccountComparator implements Comparator<BankAccount> {

    /**
     * This method compares two BankAccount objects based on their account number.
     * @param o1 the first BankAccount object
     * @param o2 the second BankAccount object
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return Integer.compare(o1.getAccountNumber(), o2.getAccountNumber());
    }
}