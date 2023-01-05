package com.pazzi.config;

import com.pazzi.model.Shinobi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.pazzi")
public class ApplicationConfig {

    @Bean(name = "shinobi")
    @Scope(value = "prototype")
    public Shinobi shinobi() {
        return new Shinobi();
    }
}
