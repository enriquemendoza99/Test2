/**
 * CS 251 LAB 4 - Exceptions
 *  This class represents an exception that is thrown when there are insufficient
 *  funds in a bank account.
 * Student name : Enrique Mendoza
 */
public class InsufficientFundsException extends Exception {
    private double shortfallAmount;
    /**
     * Store shortfall amount and sent a message
     * @param amount shortfall amount
     */
    public InsufficientFundsException(double amount){
        // Call the superclass constructor with the message of needing more money
        super("You need more money");
        shortfallAmount = amount;
    }
    /**
     * Get the shortfall amount
     * @return the value of the shortfall amount
     */
    public double getShortfallAmount(){
        return shortfallAmount;
    }
}