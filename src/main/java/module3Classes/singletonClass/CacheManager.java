package module3Classes.singletonClass;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    // single instance
    private static CacheManager instance;

    // in-memory cache
    private Map<String, String> cache = new HashMap<>();

    // private constructor
    private CacheManager() {
        System.out.println("Cache Manager initialized");
    }

    // global access point
    public static CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    // get data from cache
    public String getData(String key) {
        if (cache.containsKey(key)) {
            System.out.println("Fetching from cache...");
            return cache.get(key);
        }

        // simulate expensive operation
        System.out.println("Fetching from database...");
        String value = "Data for " + key;

        cache.put(key, value);
        return value;
    }
}

