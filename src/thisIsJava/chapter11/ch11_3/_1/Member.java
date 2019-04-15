package thisIsJava.chapter11.ch11_3._1;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    ;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (id.equals(member.id)) {
                return true;
            }
        }
        return false;
    };

    //11.3.2
    //객체의 동등 비교를 위해서는 equals() 메소드 뿐만 아니라 hashCode() 메소드도 재정의해서 논리적 동등 객체일 경우 동일한 해시코드가 리턴되도록 할 것.
    public int hashCode() {
        return id.hashCode(); //String의 hashCode()는 같은 문자열일 경우 동일한 해시코드를 리턴.
    };

}
