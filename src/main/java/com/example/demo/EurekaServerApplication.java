package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	@Value("${test.message}")
	String message;
	public static void main(String[] args) {
		BeanFactory bf=SpringApplication.run(EurekaServerApplication.class, args);
		
		System.out.println("Messages:"+bf.getBean(EurekaServerApplication.class).message);
	}
}
