public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Constructor: initialize balance to 0
    public BankAccount(String firstName, String lastName, int accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdrawal method
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to print account summary
    public void accountSummary() {
        System.out.println("Account Holder: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);
    }
}
