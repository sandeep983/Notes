package com.cosmostaker.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SpringConfig {
    // Define bean for HappyFortune service
    @Bean
    public IFortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    // Define bean for SwimCoach and Inject Dependency
    @Bean
    public ICoach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }
}
