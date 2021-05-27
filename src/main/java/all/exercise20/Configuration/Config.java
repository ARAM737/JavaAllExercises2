package all.exercise20.Configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableAspectJAutoProxy
@EnableJpaRepositories(basePackages = {"all.exercise20"})
public class Config {
}
