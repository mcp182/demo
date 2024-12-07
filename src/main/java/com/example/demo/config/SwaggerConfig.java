package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI productApi() {
        return new OpenAPI().info(new Info().title("DEMO API")
                .description("SIMPLE API TO TEST")
                .version("1.0"));

    }

}