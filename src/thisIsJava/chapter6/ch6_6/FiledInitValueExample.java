package thisIsJava.chapter6.ch6_6;

public class FiledInitValueExample {
    public static void main(String[] args) {
        FieldInitValue fiv = new FieldInitValue();

        System.out.println("byteField:" + fiv.byteField);
        System.out.println("booleanField:" + fiv.booleanField);
        System.out.println("charField:" + fiv.charField);
        System.out.println("doubleField:" + fiv.doubleField);
        System.out.println("arrField:" + fiv.arrField);
        System.out.println("referenceField:" + fiv.referenceField);
    }
}
