package BankAccountPackage;

public class BankAccountTest {
    public final BankAccount a;

    public BankAccountTest() {
        a = new BankAccount(100, 25, 0.001f);
    }

    private static void test_creation() {
        BankAccount a = new BankAccount(100.0f, 31, 0.0001f);
        assert a.balance == 100.0f : "Incorrect balance!";
        assert a.interestEarned == 0.0f : "Incorrect interest!";
        assert a.dayLastOp == 31 : "Incorrect day last operation!";
        assert a.interestRate == 0.05001f : "Incorrect interest rate!";
    }

    private static void test_deposit() {
        BankAccount a = new BankAccount(100.0f, 31, 0.0001f);
        a.deposit(50f, 61);
        assert a.balance == 150f;
        assert a.interestEarned > 0.299999f && a.interestEarned < 0.3000001f;
        assert a.dayLastOp == 61;
    }

    private static void test_withdraw() {
        BankAccount a = new BankAccount(100.0f, 31, 0.0001f);
        a.withdraw(50f, 61);
        assert a.balance == 50f;
        assert a.interestEarned > 0.299999f && a.interestEarned < 0.3000001f;
        assert a.dayLastOp == 61;
    }

    private static void test_credit_interest() {
        BankAccount a = new BankAccount(100.0f, 31, 0.0001f);
        a.deposit(50f, 61);
        a.credit_interest();
        assert a.balance == 150.3f;
        assert a.interestEarned == 0.0f;
        System.out.println("The account has generated: " + "£" + a.balance + " as balance and " + a.interestEarned + " as interest");

    }

    public static void main(String[] args) {
        test_creation();
        test_deposit();
        test_withdraw();
        test_credit_interest();
        //System.out.println("Success!");
    }
}

