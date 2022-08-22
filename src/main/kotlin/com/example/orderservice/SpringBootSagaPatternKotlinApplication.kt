package com.example.orderservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.UUID

@SpringBootApplication
class SpringBootSagaPatternKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringBootSagaPatternKotlinApplication>(*args)
    println(UUID.randomUUID())
}
