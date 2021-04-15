package all.exercise5;

public enum Singleton3 {
    INSTANCE;

    public Singleton3 getInstance() {
        System.out.println("Enumeration");
        return INSTANCE;
    }
}
