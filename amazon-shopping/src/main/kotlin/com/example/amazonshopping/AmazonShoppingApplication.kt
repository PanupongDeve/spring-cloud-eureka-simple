package com.example.amazonshopping

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableEurekaClient
class AmazonShoppingApplication {

	@LoadBalanced
	@Bean
	fun getTemplate() :RestTemplate {
		return RestTemplate();
	}
}



fun main(args: Array<String>) {
	runApplication<AmazonShoppingApplication>(*args)
}
