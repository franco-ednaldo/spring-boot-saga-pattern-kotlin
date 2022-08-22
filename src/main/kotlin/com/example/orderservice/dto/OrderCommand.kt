package com.example.orderservice.dto

import com.example.orderservice.enumeration.OrderStatus

class OrderCommand(
    val userId: Int,
    val productId: Int,
    val price: Double) {
}