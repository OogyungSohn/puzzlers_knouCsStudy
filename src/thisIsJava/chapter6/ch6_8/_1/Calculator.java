package thisIsJava.chapter6.ch6_8._1;

public class Calculator {
    void powerOn() {
        System.out.println("전원 켬");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double devide(int x, int y) {
        double result = (double)x / (double)y;
        return result;
    }

    void powerOff() {
        System.out.println("전원 끔");

    }
}
