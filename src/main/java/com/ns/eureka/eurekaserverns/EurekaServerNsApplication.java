package com.ns.eureka.eurekaserverns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerNsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerNsApplication.class, args);
	}

}
