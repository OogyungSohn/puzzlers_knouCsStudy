package thisIsJava.chapter8.ch8_2;

public interface RemoteControl {
    // 상수 public static final
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 추상 메소드 public abstract
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //디폴트 메소드. public. 사실은 구현 객체가 가지고 있는 인스턴스 메소드. 기존 인터페이스 확장해 새 기능 추가
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");
        } else {
          System.out.println("무음 해제합니다.");
        }
    }

    //정적 메소드. public

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }


}
