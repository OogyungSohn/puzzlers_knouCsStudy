package thisIsJava.chapter6.ch6_4;

public class StudentExample { //실행 클래스
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1변수가 Student객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2변수가 또 다른 Student객체를 참조합니다.");
    }
}
