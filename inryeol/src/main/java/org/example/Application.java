package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 2.1장
@SpringBootApplication
@EnableJpaAuditing /* 3.5장에서 어노테이션 추가*/
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

