package com.ww;

import com.ww.servcie.FeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients(clients = {FeignService.class},basePackages = "com.ww.service")
public class ConsumerApplication {

	@Value("${name}")
	private List<Integer> ids =  new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);


	}




}
