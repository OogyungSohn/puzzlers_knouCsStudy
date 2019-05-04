package thisIsJava.chapter6.ch6_test.num20;

import thisIsJava.chapter6.ch6_13._2.constructor1.A;

import java.util.Scanner;

public class BankApplicationTest {

    /* 책 참고 안 하고 메소드 없이 만들려다가 굉장히 복잡해져서 참고해서 하기로 허허
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];

        boolean run = true;
        while(run) {
            System.out.println("==============================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("==============================");

            System.out.print("선택> ");
            int number = scanner.nextInt();
            scanner.nextLine();
            //Account[] accounts = new Account[]();  (X)

            int i;
            String ano;
            String owner;
            int balance;
            switch (number) {
                case 1:
                    System.out.println("=====");
                    System.out.println("계좌생성");
                    System.out.println("=====");
                    //System.out.println();
                    //scanner.nextLine();

                    System.out.print("계좌번호: ");
                    ano = scanner.nextLine();

                    System.out.print("계좌주: ");
                    owner = scanner.nextLine();

                    System.out.print("초기입금액: ");
                    balance = scanner.nextInt();

                    Account account = new Account(ano, owner, balance);

                    //int i;
                    for (i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            accounts[i] = account;
                            //return;
                            break;
                        }
                    }

                    System.out.println("결과: " + (i+1) + "번째 계좌가 생성되었습니다.");
                    break;

                case 2:
                    System.out.println("=====");
                    System.out.println("계좌목록");
                    System.out.println("=====");

                    //int i;
                    for(i=0; i<accounts.length; i++) {
                        if(accounts[i] != null) {
                            System.out.println( "[" + (i+1) + "]     " + accounts[i].getAno() + "     " + accounts[i].getOwner() + "     " + accounts[i].getBalance());
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("=====");
                    System.out.println("예금");
                    System.out.println("=====");

                    System.out.print("계좌번호: ");
                    ano = scanner.nextLine();

                    //int j; 초기화하라고 에러 뜸.
                    int j = 0;
                    boolean has = false;
                    for(i=0; i<accounts.length; i++) {
                        if(accounts[i] != null && ano.equals(accounts[i].getAno())) {
                            j = i;
                            has = true;
                        } else {
                            has =false;
                        }

                        System.out.print("예금액");
                        balance = scanner.nextInt();
                        accounts[j].setBalance(accounts[j].getBalance() + balance);
                    }

            }
        }

    }

     */
}
