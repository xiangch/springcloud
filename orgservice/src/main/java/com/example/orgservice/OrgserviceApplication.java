package com.example.orgservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/org")
@EnableEurekaClient
public class OrgserviceApplication {
	@RequestMapping("/detail")
	public String Detail(){
		return "## The detail information about: Organization";
	}
	public static void main(String[] args) {
		SpringApplication.run(OrgserviceApplication.class, args);
	}
}
