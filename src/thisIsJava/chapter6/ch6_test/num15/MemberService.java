package thisIsJava.chapter6.ch6_test.num15;

public class MemberService {

    String message;
    String id;
    String password;

    public boolean login(String id, String password) {

        if(id.equals("hong") && password.equals("12345")) {
        //if(id == "hong" && password == "12345") {
            this.id = id;
            return true;
        } else return false;
    }

    public void logout(String id) {
        if(this.id == id) {
            message = "로그아웃 되었습니다.";
            System.out.println(message);
        }
    }
}
