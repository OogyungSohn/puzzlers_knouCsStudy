package thisIsJava.chapter6.ch6_test.num18;

public class ShopServiceExample {
    public static void main(String[] args) {

        //ShopService의 생성자도 private 해줘야 함
        //ShopService shop = new ShopService();

        ShopService obj1 = ShopService.getInstance();
        ShopService obj2= ShopService.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService객체이다.");
        } else {
            System.out.println("다른 ShopService객체이다.");
        }
    }
}
