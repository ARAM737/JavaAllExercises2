package all.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        ArrayList <Human> list = new ArrayList<Human>();
        Human Aram = new Human(18, "Aram", "Grigoryan", LocalDate.of(2002,03,18), 70);
        Human Ivan = new Human(20, "Ivan", "Ivanov", LocalDate.of(2000,04,20), 100);
        Human Andrey = new Human(25, "Andrey", "Andreev", LocalDate.of(2001,05,23), 80);
        Human Stepan = new Human(30, "Stepan", "Stepanov", LocalDate.of(1998,05,15), 93);
        Human Vasya = new Human(28, "Vasya", "Pupkin", LocalDate.of(2001,01,31), 75);

        list.add(Aram);
        list.add(Ivan);
        list.add(Andrey);
        list.add(Stepan);
        list.add(Vasya);

        Stream<Human> stream = list.stream();

        stream.sorted(Comparator.comparing(Human::getFirstName).reversed())
                .peek(human -> System.out.println(human.getFirstName() + " " + human.getLastName() + " " + human.getAge()))
                .filter(human -> human.getAge() > 20)
                .peek(human -> System.out.println(human.getFirstName() + " " + human.getLastName() + " " + human.getAge()))
                .forEach(human -> {
                    System.out.println(human.getFirstName() + " " + human.getLastName() + " " + human.getAge());
                });

        Stream<Human> stream2 = list.stream();

        stream2.forEach(human -> {
            System.out.print(human.getFirstName() + " ");
        });
    }
}
