package com.example.orderservice.dto

import com.example.orderservice.enumeration.OrderStatus

class OrderOutPut(
     val id: String,
    val userId: Int,
    val productId: Int,
    val price: Double,
    val orderStatus: OrderStatus
) {
}