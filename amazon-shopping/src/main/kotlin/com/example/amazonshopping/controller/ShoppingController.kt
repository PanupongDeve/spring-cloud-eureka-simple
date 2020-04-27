package com.example.amazonshopping.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject


@RestController
class ShoppingController {
    @Autowired
    private lateinit var template: RestTemplate;

    @GetMapping("/amazon-payment/{price}")
    fun invokePaymentService(@PathVariable price: Int): String? {
        var url: String = "http://PAYMENT-SERVICE/payment-provider/payNow/$price";
        return template.getForObject(url);
    }
}