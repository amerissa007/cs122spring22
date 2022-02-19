package assignments.assignment1;

public class AccountDriver {
    public static void main(String[] args) {
        Account user1 = new Account(1, 1000.00);
        CheckingAccount user2 = new CheckingAccount(2, 2000.00, 5.00);
        SavingAccount user3 = new SavingAccount(3, 3000.00);

        user1.deposit(2000);
        user1.setAnnualInterestRate(2.5);
        user1.withdraw(2000);

        user2.deposit(2000);
        user2.setAnnualInterestRate(2.5);
        user2.withdraw(4000.00);

        user3.deposit(2000);
        user3.setAnnualInterestRate(2.5);
        user3.withdraw(4000);
    }
}
