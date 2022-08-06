package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 5.7장 추가
@Configuration
@EnableJpaAuditing
public class JpaConfig {
}
