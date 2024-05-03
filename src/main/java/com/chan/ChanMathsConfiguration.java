package com.chan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChanMathsConfiguration {
    @Bean
    public ChanMaths chanMaths() {
        return new ChanMathsImpl();
    }
}
