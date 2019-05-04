package thisIsJava.chapter6.ch6_test.num19;

public class Account {
    //상수 final static
    final static int MIN_BALANCE = 0;
    final static int MAX_BLANACE = 1000000;
    //0<=private balancce <=100,0000
    private int balance;

    public void setBalance(int balance) {
        if(balance >= MIN_BALANCE && balance <= MAX_BLANACE) {
            this.balance = balance;
        } return;
        //return을 해주는 것과 안 해주는 것의 차이는 뭘까?
    }

    public int getBalance() {
        return balance;
    }
}
