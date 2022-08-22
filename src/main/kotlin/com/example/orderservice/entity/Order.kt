package com.example.orderservice.entity

import com.example.orderservice.enumeration.OrderStatus
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Order(
    @Id var id: String?=null,
    val userId: Int,
    val productId: Int,
    val price: Double,
    val orderStatus: OrderStatus = OrderStatus.ORDER_CREATED
) {

}