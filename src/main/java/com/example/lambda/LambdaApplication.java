package com.example.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.example.lambda.controllers.ExceptionController;
import com.example.lambda.controllers.GoodbyeController;
import com.example.lambda.controllers.HelloController;

@SpringBootApplication
@Import({ HelloController.class, GoodbyeController.class, ExceptionController.class })
public class LambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
	}

	@Bean
	public HandlerMapping handlerMapping() {
		return new RequestMappingHandlerMapping();
	}

	@Bean
	public HandlerAdapter handlerAdapter() {
		return new RequestMappingHandlerAdapter();
	}
}
