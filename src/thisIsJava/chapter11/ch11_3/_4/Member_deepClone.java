package thisIsJava.chapter11.ch11_3._4;


import java.util.Arrays;

public class Member_deepClone implements Cloneable{
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public Member_deepClone(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    //clone()메소드 재정의
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //먼저 얕은 복사를 해서 name, age를 복제
        Member_deepClone cloned = (Member_deepClone) super.clone(); //Object의 clone() 호출
        //scores를 깊은 복제한다.
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        //car를 깊은 복제
        cloned.car = new Car(this.car.model);
        return cloned;
    }

    //재정의된 clone() 메소드 호출
    public Member_deepClone getMember() {
        Member_deepClone cloned = null;
        try {
            cloned = (Member_deepClone) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
