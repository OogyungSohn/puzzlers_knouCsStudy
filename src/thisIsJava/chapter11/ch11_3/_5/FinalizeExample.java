package thisIsJava.chapter11.ch11_3._5;

public class FinalizeExample {
    public static void main(String[] args) {
        Counter counter = null;
        for(int i=1; i<=50; i++) {
            counter = new Counter(i);
            counter = null;
            System.gc();
        }
    }
}
