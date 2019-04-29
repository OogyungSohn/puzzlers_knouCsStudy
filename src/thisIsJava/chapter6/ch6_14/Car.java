package thisIsJava.chapter6.ch6_14;

public class Car {
    private int speed;
    private boolean stop; //초기값 false

    //Getter - 객체 필드값 변환해 사용하기 위함(?)
    public int getSpeed() {
        return speed;
    }

    //Setter - 매개값 검증
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    //필드타입이 boolean인 Getter 메소드
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
