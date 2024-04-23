package account;

import comparator.HolderComparator;

/**
 * @author Edvanio Correia
 * @version 1.0
 * This class represents a holder of a bank account.
 * It includes methods to get and set the holder's name and client ID.
 */
public class Holder {
    private String name;
    private int clientID;

    /**
     * Constructs a new Holder with the given name and client ID.
     * @param name the name of the holder
     * @param clientID the client ID of the holder
     */
    public Holder(String name, int clientID){
        this.name = name;
        this.clientID = clientID;
    }

    /**
     * Returns the name of the holder.
     * @return the name of the holder
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the holder.
     * @param name the new name of the holder
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the client ID of the holder.
     * @return the client ID of the holder
     */
    public int getClientId() {
        return clientID;
    }

    /**
     * Sets the client ID of the holder.
     * @param clientID the new client ID of the holder
     */
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * The result is true if and only if the argument is not null and is a Holder object that
     * represents the same client ID as this object.
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if((obj == null) || (getClass() != obj.getClass())) return false;

        Holder holder = (Holder) obj;
        HolderComparator comparator = new HolderComparator();
        return comparator.compare(this, holder) == 0;
    }
}