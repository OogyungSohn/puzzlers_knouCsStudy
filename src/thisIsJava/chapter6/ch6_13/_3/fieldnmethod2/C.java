package thisIsJava.chapter6.ch6_13._3.fieldnmethod2;

import thisIsJava.chapter6.ch6_13._3.fieldnmethod1.A;

public class C {
    public C() {
        A a = new A();
        a.field1 = 1;
       // a.field2 = 1;
       // a.field3 = 1;

        a.method1();
        // a.method2();
        // a.method3();
        //컴파일 에러
        //public 필드만 접근 가능.
    }
}
