public class CheckingAccount extends BankAccount {
    private double interestRate;
    private final double overdraftFee = 30.0;

    // Constructor: inherits from BankAccount and initializes interestRate
    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    // Get the interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Process withdrawal with overdraft fee
    public void processWithdrawal(double amount) {
        if (amount > getBalance()) {
            System.out.println("Overdraft! A $30 fee has been applied.");
            withdrawal(getBalance()); // Withdraw available balance
            withdrawal(overdraftFee); // Apply overdraft fee
        } else {
            withdrawal(amount);
        }
    }

    // Display account details including interest rate
    public void displayAccount() {
        accountSummary(); // Call superclass method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
