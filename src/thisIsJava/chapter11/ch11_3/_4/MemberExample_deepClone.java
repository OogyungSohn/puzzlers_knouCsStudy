package thisIsJava.chapter11.ch11_3._4;

public class MemberExample_deepClone {
    public static void main(String[] args) {
        Member_deepClone original = new Member_deepClone("홍길동", 25, new int[] {90, 99}, new Car("소나타"));

        Member_deepClone cloned = original.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "그랜저";

        System.out.println("복제객체의 필드값");
        System.out.println("name: " + cloned.name);
        System.out.println("age: " + cloned.age);
        System.out.print("scores: {");
        for(int i=0; i<cloned.scores.length; i++) {
            System.out.println(cloned.scores[i]);
            System.out.println((i==(cloned.scores.length-1))?"":",");
        }
        System.out.println("}");
        System.out.println("car: " + cloned.car.model);

        System.out.println();

        System.out.println("원본객체의 필드값");
        System.out.println("name: " + original.name);
        System.out.println("age: " + original.age);
        System.out.print("scores: {");
        for(int i=0; i<original.scores.length; i++) {
            System.out.println(original.scores[i]);
            System.out.println((i==(original.scores.length-1))?"":",");
        }
        System.out.println("}");
        System.out.println("car: " + original.car.model);
    }
}
