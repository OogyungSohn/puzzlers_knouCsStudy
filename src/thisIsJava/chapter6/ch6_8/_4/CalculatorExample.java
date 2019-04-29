package thisIsJava.chapter6.ch6_8._4;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        double result1 = myCalc.areaRectangle(10);

        double result2 = myCalc.areaRectangle(10, 5);

        System.out.println("정사각형의 넓이는 " + result1);
        System.out.println("직사각형의 넓이는 " + result2);
    }
}
