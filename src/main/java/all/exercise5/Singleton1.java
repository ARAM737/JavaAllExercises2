package all.exercise5;

public class Singleton1 {

    private Singleton1() {
        System.out.println("Class Holder Singleton");
    }


    public static class SingletonHolder {
        public static final Singleton1 HOLDER_INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
