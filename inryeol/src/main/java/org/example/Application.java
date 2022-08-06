package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 2.1장
@SpringBootApplication
// @EnableJpaAuditing /* 5.7장에서 삭제 */
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

