package com.leyva.geometry.config;

import com.leyva.geometry.service.ShapeCalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ShapeCalculatorService shapeCalculatorService(){
        return new ShapeCalculatorService();
    }

}
