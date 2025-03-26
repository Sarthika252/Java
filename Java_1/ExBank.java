
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
}
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) throws NegativeNumberException {
        if (initialBalance < 0) {
            throw new NegativeNumberException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }
    public double balanceEnquiry() {
        return balance;
    }

   
    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Withdrawal amount cannot be negative");
        }
        if (balance - amount < 0) {
            throw new LowBalanceException("Insufficient balance");
        }
        balance -= amount;
    }

    
    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Deposit amount cannot be negative");
        }
        balance += amount;
    }
}
public class ExBank{
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(1000);
            System.out.println("Initial balance: " + account.balanceEnquiry());
            account.deposit(500);
            System.out.println("Balance after deposit: " + account.balanceEnquiry());
            account.withdraw(200);
            System.out.println("Balance after withdrawal: " + account.balanceEnquiry());
            account.withdraw(2000);
            } catch (NegativeNumberException | LowBalanceException e) {
            System.out.println("Exception occurred " + e.getMessage());
        }
    }
}