package thisIsJava.chapter6.ch6_7._3;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "012-345");
        System.out.println("k1.name: " + k1.name);
        System.out.println("k2.ssn: " + k1.ssn);

        Korean k2 = new Korean("이자바", "234-567");
        System.out.println("k2.name: " + k2.name);
        System.out.println("k2.ssn: " + k2.ssn);


    }
}
