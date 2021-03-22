package com.taufik.microservice.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class MyDemoMicroserviceHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoMicroserviceHystrixDashboardApplication.class, args);
	}

}
