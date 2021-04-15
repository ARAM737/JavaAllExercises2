package all.exercise10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {
    @Bean
    public HarryPotter harryMagic(){
        return new HarryPotter();
    }
    @Bean
    public Voldemort voldemortMagic(){
        return new Voldemort();
    }
    @Bean
    public RonWeesly ronMagic(){
        return new RonWeesly();
    }
}
