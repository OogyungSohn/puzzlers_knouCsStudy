package thisIsJava.chapter11.ch11_3._4;

public class Member_thinClone implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member_thinClone(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;

    }

    public Member_thinClone getMember() {
        Member_thinClone cloned = null;
        try {
            cloned = (Member_thinClone) clone();
        } catch (CloneNotSupportedException e) { }
        return cloned;
    }
}
