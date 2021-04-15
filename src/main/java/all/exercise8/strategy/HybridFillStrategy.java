package all.exercise8.strategy;

public class HybridFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Заправляем бензином или электричеством на выбор!");
    }
}// Заправка для гибридов
