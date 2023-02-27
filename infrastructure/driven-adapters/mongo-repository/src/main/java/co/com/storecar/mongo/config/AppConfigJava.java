package co.com.storecar.mongo.config;

import co.com.storecar.mongo.generic.serializer.JSONMapper;
import co.com.storecar.mongo.generic.serializer.JSONMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigJava {
    @Bean
    public JSONMapper getJsonMApper(){
        return new JSONMapperImpl();
    }
}
