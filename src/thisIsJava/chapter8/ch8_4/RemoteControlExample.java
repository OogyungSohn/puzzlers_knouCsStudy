package thisIsJava.chapter8.ch8_4;

import thisIsJava.chapter8.ch8_2.RemoteControl;
import thisIsJava.chapter8.ch8_3.Audio;
import thisIsJava.chapter8.ch8_3.Television;

public class RemoteControlExample {
    public static void main(String[] args) {

        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);
        rc.turnOff();

        RemoteControl.changeBattery();
    }
}
