package com.pluralsight.cloud.function;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudFunctionDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFunctionDeploymentApplication.class, args);
	}

	@Bean
	public Function<String,String> function(){
		return value -> "greetings, pluralsight and cloud user" +value;
	}
}
