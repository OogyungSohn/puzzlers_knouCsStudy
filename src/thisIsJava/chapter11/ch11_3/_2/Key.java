package thisIsJava.chapter11.ch11_3._2;

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key compareKey = (Key) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    //Object클래스의 hashCode() 재정의
    @Override
    public int hashCode() {
        return number;
    }
}
