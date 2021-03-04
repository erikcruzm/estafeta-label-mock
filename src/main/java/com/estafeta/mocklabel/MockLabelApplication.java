package com.estafeta.mocklabel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "com.estafeta.mocklabel")
public class MockLabelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockLabelApplication.class, args);
	}

}
