package thisIsJava.chapter6.ch6_7._4;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.company);
        System.out.println("---");

        Car car2 = new Car("슈퍼카");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println("---");

        Car car3 = new Car("미니카", "빨강");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println("---");

        Car car4 = new Car("럭셔리카", "하양", 999);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
    }
}
