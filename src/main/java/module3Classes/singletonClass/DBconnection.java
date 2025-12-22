package module3Classes.singletonClass;

public class DBconnection {
    private static DBconnection instance;

    private DBconnection(){
        System.out.println("Database is connected");
    }

    public static DBconnection getInstance(){
        if(instance==null){ instance = new DBconnection(); }
        return instance;
    }
}
