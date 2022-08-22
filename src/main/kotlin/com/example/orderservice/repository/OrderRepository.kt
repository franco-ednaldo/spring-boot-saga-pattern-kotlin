package com.example.orderservice.repository

import com.example.orderservice.entity.Order
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface OrderRepository: ReactiveMongoRepository<Order, UUID> {
}