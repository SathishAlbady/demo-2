package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Demo2Application.class, args);
		gameRunnable run=context.getBean(gameRunnable.class);
		run.runner();
	}

}
