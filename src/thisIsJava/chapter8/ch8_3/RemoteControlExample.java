package thisIsJava.chapter8.ch8_3;

import thisIsJava.chapter8.ch8_2.RemoteControl;

public class RemoteControlExample {
    public static void main(String[] args) {
//        RemoteControl rc;
//        rc = new Television();
//        rc = new Audio();

        //익명 구현 객체
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("무언가를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("무언가를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                System.out.println("볼륩을 설정합니다.");
            }
        };

        RemoteControl rc2 = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("무언가를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("무언가를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                System.out.println("볼륩을 설정합니다.");
            }
        };
    }
}
