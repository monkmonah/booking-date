package com.booking.date.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.event.LoggingEventListener;

@SpringBootApplication
class ApplicationConfiguration {
    @Bean
    public LoggingEventListener mongoEventListener() {
        return new LoggingEventListener();
    }
    

}
