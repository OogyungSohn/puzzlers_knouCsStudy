package thisIsJava.chapter6.ch6_8._3;

public class Car {
    int speed;

    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌린다.");
    }

    void run() {
        for(int i=10; i<=50; i+=10) {
            speed = i;
            System.out.println("달린다.(시속: " + speed + " km/h)");
        }
    }
}
