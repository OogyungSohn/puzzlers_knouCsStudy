package thisIsJava.chapter6.ch6_test.num18;

public class ShopService {
    private static ShopService obj = new ShopService();

    private ShopService() {}
    public static ShopService getInstance() {
        return obj;
    }

}
