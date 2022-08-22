package com.example.orderservice.controller

import com.example.orderservice.dto.OrderCommand
import com.example.orderservice.dto.OrderOutPut
import com.example.orderservice.service.OrderService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("order")
@Slf4j
class OrderController(val orderService: OrderService) {

    @PostMapping
    fun create(@RequestBody orderCommand: Mono<OrderCommand>): Mono<OrderOutPut> {
        return orderCommand.flatMap(this.orderService::create);
    }

    @GetMapping
    fun findAll(): Flux<OrderOutPut> {
        return this.orderService.findAll();
    }
}