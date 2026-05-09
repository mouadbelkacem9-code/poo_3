package tp_java;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("anas", 1000.0);
        System.out.println(account);

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance() + " DA");

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance() + " DA");

        account.withdraw(5000.0);

        account.setOwnerName("Mouad");
        account.setBalance(2000.0);

        System.out.println(account);
    }
}