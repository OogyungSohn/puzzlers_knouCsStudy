package thisIsJava.chapter6.ch6_10._4;

public class Car {
    int field1;
    void method1() {

    }

    static int field2;
    static void method2() {

    }

    static {
        //field1 = 10;
        //methos1();
        //정적 초기화 블록에서 인스턴스 필드와 인스턴스 메소드 사용 불가. 컴파일 에러
        //객체 생성 후 인스턴트 멤버 사용 가능.
        Car myCar = new Car();
        myCar.field1 = 10;
        myCar.method1();

        field2 = 10;
        method2();
    }

    static void Method3() {
        //this.field1 = 10;
        //this.method1();
        //객체 자신의 참조인 this 키워드 사용 불가. 컴파일 에러

        field2 = 10;
        method2();
    }
}
