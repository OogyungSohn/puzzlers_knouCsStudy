package thisIsJava.chapter6.ch6_8._1;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int [] values1 = {1, 2, 3};
        int result1 = myCom.sum1(values1);
        System.out.println("result1: " + result1);

        int result1_1 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
        System.out.println("result1_1: " + result1_1);
        //매개변수를 배열 타입으로 선언해서, 메소드 호출 전에 배열 생성해야함.

        int result2 = myCom.sum2(1, 2, 3);
        System.out.println("result2: " + result2);

        int result2_2 = myCom.sum2(4, 5, 6, 7, 8);
        System.out.println("result2_2: " + result2_2);
        //...로 매개변수 선언 -> 넘겨준 값의 리스트의 길이에 따라 자동으로 배열 생성됨.
    }
}
