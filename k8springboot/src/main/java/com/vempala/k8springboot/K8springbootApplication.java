package com.vempala.k8springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class K8springbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8springbootApplication.class, args);
	}

}
