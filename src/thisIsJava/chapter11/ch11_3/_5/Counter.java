package thisIsJava.chapter11.ch11_3._5;

public class Counter {
    private int no;

    public Counter(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "번 객체의 finalize()가 실행됨");
    }

}
