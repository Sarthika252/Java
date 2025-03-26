//1.Single inheritance
class BankAccount {
protected double balance;
public BankAccount(double initialBalance) {
this.balance = initialBalance;
}
public void deposit(double amount) {
balance += amount;
System.out.println("Deposited: " + amount);
}
public void withdraw(double amount) {
if (balance >= amount) {
balance -= amount;
System.out.println("Withdrawn: " + amount);
} else {
System.out.println("Insufficient funds");
}
}
public double getBalance() {
return balance;
}
}
class SavingsAccount extends BankAccount {
private static final double MIN_BALANCE = 100;public SavingsAccount(double initialBalance) {
super(initialBalance);
}
//Override
public void withdraw(double amount) {
if (balance - amount >= MIN_BALANCE) {
super.withdraw(amount);
} else {
System.out.println("Withdrawal not allowed. Minimum balance requirement not met.");
}
}
}
public class bank {
public static void main(String[] args) {
// Example usage:
SavingsAccount savingsAccount = new SavingsAccount(500);
System.out.println("Initial Balance: " + savingsAccount.getBalance());
savingsAccount.deposit(200);
System.out.println("Current Balance: " + savingsAccount.getBalance());
savingsAccount.withdraw(50);
System.out.println("Current Balance: " + savingsAccount.getBalance());
savingsAccount.withdraw(200);
System.out.println("Current Balance: " + savingsAccount.getBalance());
}
}