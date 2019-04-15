package thisIsJava.chapter8.ch8_5;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        /*
        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();
        */

        //배열로 수정
        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();

    }
}
