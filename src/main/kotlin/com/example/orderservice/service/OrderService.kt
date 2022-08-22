package com.example.orderservice.service

import com.example.orderservice.dto.OrderCommand
import com.example.orderservice.dto.OrderOutPut
import com.example.orderservice.entity.Order
import com.example.orderservice.enumeration.OrderStatus
import com.example.orderservice.mapper.OrderMapper
import com.example.orderservice.repository.OrderRepository
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.UUID

@Service
class OrderService(private val orderRepository: OrderRepository) {
    private val orderMapper: OrderMapper = Mappers.getMapper(OrderMapper::class.java)
    fun create(orderCommand: OrderCommand): Mono<OrderOutPut> {
        return this.orderRepository
            .save(this.orderMapper.orderCommandToOrder(orderCommand, OrderStatus.ORDER_CREATED))
            .doOnNext { this.emitEvent(it) }
            .map { this.orderMapper.orderToOrderOutPut(it) };
    }

    private fun emitEvent(it: Order) {
        println("Emit evento")
    }

    fun findAll(): Flux<OrderOutPut> {
        return this.orderRepository.findAll()
            .map(this.orderMapper::orderToOrderOutPut)
    }
}