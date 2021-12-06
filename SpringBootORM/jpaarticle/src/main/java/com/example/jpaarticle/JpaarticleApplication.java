package com.example.jpaarticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JpaarticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaarticleApplication.class, args);
    }

}
