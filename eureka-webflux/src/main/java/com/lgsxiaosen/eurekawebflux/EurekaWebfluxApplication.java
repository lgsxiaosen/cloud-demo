package com.lgsxiaosen.eurekawebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaWebfluxApplication.class, args);
	}

}
