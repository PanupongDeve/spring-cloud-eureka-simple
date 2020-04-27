package com.example.amazonserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class AmazonServerApplication

fun main(args: Array<String>) {
	runApplication<AmazonServerApplication>(*args)
}
