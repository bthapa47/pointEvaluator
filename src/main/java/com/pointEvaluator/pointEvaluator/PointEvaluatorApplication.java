package com.pointEvaluator.pointEvaluator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
@ComponentScan(basePackages = "com.pointEvaluator.pointEvaluator")
@EntityScan("com.pointEvaluator.pointEvaluator.model.**")
@ComponentScan({ "com.pointEvaluator.pointEvaluator.*" })
public class PointEvaluatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PointEvaluatorApplication.class, args);
	}
	@Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
	
}
