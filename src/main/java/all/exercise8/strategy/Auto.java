package all.exercise8.strategy;

public class Auto {

    FillStrategy fillStrategy;

    public void fill() {
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

}
