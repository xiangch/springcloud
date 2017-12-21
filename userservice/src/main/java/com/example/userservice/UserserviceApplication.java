package com.example.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class UserserviceApplication {
    @Value("${server.port}")
    private String port;

	@RequestMapping("/user")
	public String Detail(@RequestParam(required = false,defaultValue = "zxc") String name){
		return "The port:"+port+" User:"+name;
	}
	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}
}
