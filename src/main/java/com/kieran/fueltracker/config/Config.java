package com.kieran.fueltracker.config;

import com.fasterxml.jackson.databind.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@Configuration
public class Config {

    @Bean
    protected Module module() {
        return new Hibernate5Module();
    }
}
