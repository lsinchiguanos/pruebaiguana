package ec.iguana.leslie.sinchiguano.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@PropertySource("classpath:message.properties")
public class PropertiesWithConfig {
}
