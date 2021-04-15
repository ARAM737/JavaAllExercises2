package all.exercise8.strategy;

public class StandartFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Просто заправляем бензин!");
    }
}//заправка для обычных автомобилей
