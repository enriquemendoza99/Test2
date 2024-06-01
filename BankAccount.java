/**
 * CS 251 LAB 4 - Exceptions
 * Student name : Enrique Mendoza
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    /**
     * Method to store the account number in a variable
     * @param number is the account number
     */
    public BankAccount (int number){
        accountNumber = number;
        balance = 0;
    }
    /**
     * Method to return the account number
     * @return the value of the account number
     */
    public int getAccountNumber(){
        return accountNumber;
    }
    /**
     * Method to return the balance of the bank account
     * @return the balance of the bank account
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Method to increase the balance of the bank account if the amount is not
     * negative
     * @param amount value of the amount to deposit
     * @throws IllegalArgumentException if the amount is negative
     */
    public void depositFunds(double amount){
        // Check for negative deposit amount
        if (amount < 0){
            throw new IllegalArgumentException("Attempted to deposit negative amount"
                    + amount);
        }
        balance += amount;
    }
    /**
     * Method that takes an amount and subtracts it from the current account
     * balance. The amount must be positive and less than the current balance
     * @param amount value of the withdrawal of the bank account
     * @throws IllegalArgumentException if the amount is negative
     * @throws InsufficientFundsException if the amount of the withdrawal is
     * more than the balance
     */
    public void withdrawFunds (double amount) throws InsufficientFundsException {
        // Check for negative withdraw amount, if not throw an exception
        if (amount < 0){
            throw new IllegalArgumentException("An attempt has been made to " +
                    "withdraw a negative amount:" + amount);
        }
        // Check if sufficient funds, if not throw an exception
        if (amount > balance){
            throw new InsufficientFundsException(amount - balance);
        }
        balance -=amount;
    }
}