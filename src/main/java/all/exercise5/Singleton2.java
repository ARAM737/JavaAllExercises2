package all.exercise5;

public class Singleton2 {
    private static Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
        System.out.println("Lazy Initialization");
    }

    public static synchronized Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
            return INSTANCE;
        }
        return INSTANCE;
    }
}
