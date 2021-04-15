package all.exercise10;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main10 {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        HarryPotter harryPotter = applicationContext.getBean(HarryPotter.class);
        Voldemort voldemort = applicationContext.getBean(Voldemort.class);
        RonWeesly ronWeesly = applicationContext.getBean(RonWeesly.class);

        harryPotter.doMagic();
        voldemort.doMagic();
        ronWeesly.doMagic();
    }

}
