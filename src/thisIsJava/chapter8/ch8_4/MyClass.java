package thisIsJava.chapter8.ch8_4;

import thisIsJava.chapter8.ch8_2.RemoteControl;
import thisIsJava.chapter8.ch8_3.Audio;
import thisIsJava.chapter8.ch8_3.Television;

public class MyClass {
    //필드
    RemoteControl rc = new Television();

    //생성자
    MyClass(RemoteControl rc) {
        this.rc = rc;
        //MyClass mc = new MyClass(new Television();
        //---> RemoteControl rc = new Television();
    }

    //메소드
    void methodA() {
        RemoteControl rc = new Audio();
    }

    void methodB(RemoteControl rc) {
        //mc.methodB(new Audio());
    }



}
