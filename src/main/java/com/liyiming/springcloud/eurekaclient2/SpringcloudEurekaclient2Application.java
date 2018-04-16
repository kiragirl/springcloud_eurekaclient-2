package com.liyiming.springcloud.eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaclient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaclient2Application.class, args);
	}
}
