package thisIsJava.chapter6.ch6_7._5;

public class Car {
    String company = "깋아";
    String model;
    String color;
    int maxSpeed;

    Car() {
        System.out.println(company);
        System.out.println();
    }

    Car(String model) {
        this(model, "은색", 250);
    };

    Car(String model, String color) {
        this(model, color, 250);
    }

    //필드 초기화 내용은 한 생성자에만 집중적으로 작성하고, 나머지 생성자는 초기화 내용을 갖고 있는 생성자를 호출하는 방법으로 개선
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println(this.company);
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.maxSpeed);
        System.out.println();
    }


    /* 이거 아니네.. 거꾸로 호출하는 거 였군..
    Car(String model) {
        this.model = model;
    };

    Car(String model, String color) {
        this(model);
        this.color = color;
    };

    Car(String model, String color, int maxSpeed) {
        this(model, color);
        this.maxSpeed = maxSpeed;
    };
     */
}
