package thisIsJava.chapter6.ch6_test.num19;


public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("잔고는: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("잔고는:" + account.getBalance());

        account.setBalance(2000000);
        System.out.println("잔고는:" + account.getBalance());

        account.setBalance(300000);
        System.out.println("잔고는: " + account.getBalance());
    }
}
