package com.example.CachingExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
public class CachingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingExampleApplication.class, args);
	}

}
