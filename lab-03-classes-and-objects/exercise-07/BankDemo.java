public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        account.deposit(50);
        System.out.println("after deposit: " + account.getBalance());

        boolean firstWithdraw = account.withdraw(30);
        System.out.println("withdraw 30: " + firstWithdraw);

        boolean secondWithdraw = account.withdraw(1000);
        System.out.println("withdraw 1000: " + secondWithdraw);

        System.out.println("balance: " + account.getBalance());
    }
}
