package thisIsJava.chapter6.ch6_7._4;

public class Car {
    String company = "현차";
    String model;
    String color;
    int maxSpeed;

    //생성자 오버로딩
    Car() {
        //매개변수 있는 다른 생성자를 명시적으로 선언하면 기본생성자도 명시적으로 선언해줘야 기본생성자 호출 가능해짐.
    }

    Car(String model) {
        this.model = model;
        //this.은 객체 자신 참조
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    /*
    Car(String color, String model) {..} 매개변수 이름만 바꾸는 것은 생성자 오버로딩이 아니다.!
     */

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
