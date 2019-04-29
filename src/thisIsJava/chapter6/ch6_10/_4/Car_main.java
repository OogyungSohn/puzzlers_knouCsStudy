package thisIsJava.chapter6.ch6_10._4;

public class Car_main {
    int speed;

    void run() {
        System.out.println(speed +" 속도로 달립니다.");

    }

    public static void main(String[] args) {
        //speed = 60;
        //run();
        //main() 메소드도 정적(static)메소드 이므로 인스턴스 멤버 사용 불가.
        //객체 생성 후 사용 가능
        Car_main myCar = new Car_main();
        myCar.speed = 60;
        myCar.run();
    }
}
