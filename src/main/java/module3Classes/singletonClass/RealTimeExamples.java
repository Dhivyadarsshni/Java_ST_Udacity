package module3Classes.singletonClass;

public class RealTimeExamples {
    public static void main(String[] args) {
        //Database Connection
        DBconnection db1 = DBconnection.getInstance();
        DBconnection db2 = DBconnection.getInstance();

        //Logger
        Logger l1 = Logger.getLogger();
        Logger l2 = Logger.getLogger();

        l1.log("Application started");

        //App configuration
        AppConfig c1 = AppConfig.getInstance();
        AppConfig c2 = AppConfig.getInstance();

        System.out.println(c1.getAppName());
        System.out.println(c2.getAppName());


        //Cache Management
        CacheManager cache = CacheManager.getInstance();

        System.out.println(cache.getData("user1"));
        System.out.println(cache.getData("user1"));
        System.out.println(cache.getData("user2"));
        System.out.println(cache.getData("user2"));
    }

}
