package BankAccountPackage;

public class BankAccount {
    float balance;
    float interestEarned;
    final float interestRate;
    int dayLastOp;

    public BankAccount(float initialBalance, int dayCreated, float rate) {
        balance = initialBalance;
        dayLastOp = dayCreated;
        interestEarned = 0.0f;
        interestRate = rate;
    }

    public void deposit(float amount, int dayDeposited) {
        int daysInterest = dayDeposited - dayLastOp;
        interestEarned += daysInterest * interestRate * balance;
        balance += amount;
        dayLastOp = dayDeposited;
    }

    public void withdraw(float amount, int dayTaken) {
        int daysInterest = dayLastOp - dayTaken;
        interestEarned = daysInterest * interestRate * balance;
        balance -= amount;
        dayLastOp = dayTaken;
    }

    public void credit_interest() {
        balance += interestEarned;
        interestEarned = 0.0f;
    }

}
