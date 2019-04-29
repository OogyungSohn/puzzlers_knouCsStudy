package thisIsJava.chapter6.ch6_13._3.fieldnmethod1;

public class A {
    //필드
    public int field1;
    int field2;
    private int field3;

    //생성자
    public A() {
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();

        //클래스 내부일 경우 접근 제한자의 영향 받지 않음.
    }

    //메소드
    public void method1() {}
    void method2() {}
    private void method3() {}
}
