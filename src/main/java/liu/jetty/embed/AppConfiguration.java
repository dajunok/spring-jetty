package liu.jetty.embed;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages= {"liu.jetty.embed"})
@Import({WebMvcConfigurer.class})
public class AppConfiguration {

}
