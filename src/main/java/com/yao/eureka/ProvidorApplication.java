package com.yao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProvidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvidorApplication.class, args);
	}
}
