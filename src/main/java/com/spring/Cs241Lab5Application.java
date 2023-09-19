package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.spring", "com.repositories", "com.controllers"})
@EnableJpaRepositories("com.repositories")

public class Cs241Lab5Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Cs241Lab5Application.class, args);
	}

}
