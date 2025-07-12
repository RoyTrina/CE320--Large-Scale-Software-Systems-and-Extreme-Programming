package BankAccountPackage;

public class BankAccountRefactoredTest {
    public final BankAccountRefactored accountRefactored;

    public BankAccountRefactoredTest() {
        accountRefactored = new BankAccountRefactored(10000, 10, 0.22f);
    }


    private static void test_creation() {
        BankAccountRefactored a = new BankAccountRefactored(100.0f, 31, 0.0001f);
        System.out.println("The account's balance is: " + a.balance);
        System.out.println();
        //assert a.balance == 100.0f : "Incorrect balance!";
        assert a.interestEarned == 0.0f : "Incorrect interest!";
        assert a.dayLastOp == 31 : "Incorrect day last operation!";
        assert a.interestRate == 0.0001f : "Incorrect interest rate!";
    }

    private void test_deposit() {
        accountRefactored.deposit((float) 366.78, 25);

    }


}
