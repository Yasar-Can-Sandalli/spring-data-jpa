package com.sandalliyasarcan.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.sandalliyasarcan")
@ComponentScan(basePackages = "com.sandalliyasarcan")
@EnableJpaRepositories(basePackages = "com.sandalliyasarcan") // JPA repositorisini aktif etme !
@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

}
