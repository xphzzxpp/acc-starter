package com.example.accstarter.configuration;


import com.example.accstarter.AccProperties;
import com.example.accstarter.service.AccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(AccService.class)
@EnableConfigurationProperties(AccProperties.class)
@Configuration
public class AccConfifuration {

    @Autowired
    private AccProperties accProperties;

    @Bean
    @ConditionalOnMissingBean(AccService.class)
    public AccService accService(){
        return new AccService(accProperties);
    }
}
