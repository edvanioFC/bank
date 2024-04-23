package comparator;

import account.Holder;
import java.util.Comparator;

/**
 * @author Edvanio Correia
 * @version 1.0
 * This class implements Comparator for the Holder class.
 * It is used to compare two Holder objects based on their client ID.
 */
public class HolderComparator implements Comparator<Holder> {

    /**
     * This method compares two Holder objects based on their client ID.
     * @param o1 the first Holder object
     * @param o2 the second Holder object
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Holder o1, Holder o2) {
        return Integer.compare(o1.getClientId(), o2.getClientId());
    }
}