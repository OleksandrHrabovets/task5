package singleton;

public class SimpleSingleton {
    private static final SimpleSingleton instance;

    static {
        try {
            instance = new SimpleSingleton();
        } catch (Exception e) {
            throw new RuntimeException("ERROR");
        }
    }

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }
}
