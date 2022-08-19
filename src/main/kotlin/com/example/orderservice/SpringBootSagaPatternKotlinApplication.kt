package com.example.orderservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootSagaPatternKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringBootSagaPatternKotlinApplication>(*args)
}
