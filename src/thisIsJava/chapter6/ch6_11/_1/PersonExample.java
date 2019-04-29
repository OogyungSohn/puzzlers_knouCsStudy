package thisIsJava.chapter6.ch6_11._1;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123-123", "계백");
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //p1.ssn = "654-321";
        //final 필드는 수정 불가
        p1.name = "을지";

    }
}
