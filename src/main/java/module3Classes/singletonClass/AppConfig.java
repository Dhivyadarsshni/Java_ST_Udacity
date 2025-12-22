package module3Classes.singletonClass;

public class AppConfig {

    private static AppConfig config;

    private AppConfig() {}

    public static AppConfig getInstance() {
        if (config == null) {
            config = new AppConfig();
        }
        return config;
    }

    public String getAppName() {
        return "Accenture Portal";
    }
}
