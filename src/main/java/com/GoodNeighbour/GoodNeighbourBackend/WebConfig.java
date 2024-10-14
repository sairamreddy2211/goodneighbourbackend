package com.GoodNeighbour.GoodNeighbourBackend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow all paths
                .allowedOrigins("http://localhost:8081") // Allow only from this origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allowed methods
                .allowCredentials(true); // If you need to allow credentials
    }
}
