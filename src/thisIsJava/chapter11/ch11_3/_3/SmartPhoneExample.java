package thisIsJava.chapter11.ch11_3._3;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);
        System.out.println(myPhone); //System.out.println의 매개값으로 객체를 주면 객체의 toString()메소드를 호출해서 리턴값을 출력함.
    }
}
