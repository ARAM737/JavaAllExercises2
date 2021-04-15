package all.exercise7.composite;

public class Shape implements Draw{
    private String name;
    private double square;

    public Shape(String name, int r) {
        this.name = name;
        this.square = Math.PI*r*r;
    }

    @Override
    public void print() {
        System.out.println("Площадь " + name + " = " + square);
    }
}
