package LabUnit10;

// Step 1: Create custom exception class
class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void withdraw(int amount) throws InvalidBalanceException {
        int balance = 500;
        if (amount > balance) {
            throw new InvalidBalanceException("Insufficient funds! Your balance is only " + balance);
        } else {
            System.out.println("Withdrawal successful.");
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(1000);
        } catch (InvalidBalanceException e) {
            System.out.println("Caught Custom Error: " + e.getMessage());
        }
    }
}
