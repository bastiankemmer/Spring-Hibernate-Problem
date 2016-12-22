package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by bastiankemmer on 22.12.16.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class ExampleBootApplication {
    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(ExampleBootApplication.class);
        app.run(args);
    }

    /**
     * needed for internal api calls through url with virtual hostname (e.g. http://news-service/api/v1/news/articles)
     *
     * @return
     */
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
