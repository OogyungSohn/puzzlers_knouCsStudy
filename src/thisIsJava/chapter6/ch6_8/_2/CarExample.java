package thisIsJava.chapter6.ch6_8._2;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.out.println("출발합니다");
            myCar.run();
        }

        if(myCar.isLeftGas()) {
            System.out.println("gas주입 불필요");
        } else {
            System.out.println("gas 주입하시오.");
        }
    }
}
