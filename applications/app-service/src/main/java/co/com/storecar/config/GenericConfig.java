package co.com.storecar.config;

import co.com.storecar.serializer.JSONMapper;
import co.com.storecar.serializer.JSONMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GenericConfig {
    @Bean
    public JSONMapper getJsonMApper() {
        return new JSONMapperImpl();
    }
}
