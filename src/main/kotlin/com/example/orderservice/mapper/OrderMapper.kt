package com.example.orderservice.mapper

import com.example.orderservice.dto.OrderCommand
import com.example.orderservice.dto.OrderOutPut
import com.example.orderservice.entity.Order
import com.example.orderservice.enumeration.OrderStatus
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface OrderMapper {
    @Mapping(source = "orderStatus", target = "orderStatus")
    fun orderCommandToOrder(orderCommand: OrderCommand, orderStatus: OrderStatus): Order

    fun orderToOrderOutPut(order: Order): OrderOutPut
}