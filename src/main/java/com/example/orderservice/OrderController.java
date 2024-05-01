package com.example.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@RestController
@RequestMapping
public class OrderController {
    @GetMapping("/orders")
    public Order findById(@PathVariable Long id){
        return new Order(id, 1L, ZonedDateTime.now(), BigDecimal.TEN);
    }
}