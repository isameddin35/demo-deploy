package com.demo.demo_deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.demo")
public class DemoDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDeployApplication.class, args);
	}

}
