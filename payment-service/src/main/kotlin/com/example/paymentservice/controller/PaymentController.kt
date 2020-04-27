package com.example.paymentservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payment-provider")
class PaymentController {

    @GetMapping("/payNow/{price}")
    fun payNow(@PathVariable price: Int): String {
        return "payment with $price is successful!";
    }
}