package all.exercise7.composite;

public class MainC {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("Квадрат", 6, 6);
        Rectangle rectangle2 = new Rectangle("Прямоугольник", 4, 7);

        Shape shape1 = new Shape("Круг", 5);
        Shape shape2 = new Shape("Кружок", 23);

        Figure figure1 = new Figure();
        Figure figure2 = new Figure();
        Figure figure3 = new Figure();

        figure1.add(rectangle1);
        figure1.add(shape2);
        figure1.print();
        System.out.println("-------------");
        figure2.add(rectangle2);
        figure2.add(shape1);
        figure2.print();
        System.out.println("-------------");
        figure3.add(shape2);
        figure3.print();
    }
}
