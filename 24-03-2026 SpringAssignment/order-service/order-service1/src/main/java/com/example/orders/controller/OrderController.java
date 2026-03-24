package com.example.orders.controller;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.service.OrderService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	@Autowired
	private OrderService oService;
	
    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@Valid @RequestBody OrderRequestDTO request) {
    		OrderEntity oe=oService.createOrder(request);
    		OrderResponseDTO ord = OrderMapper.toResponseDTO(oe);
    		return new ResponseEntity<>(ord,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) {
    		OrderEntity oEntity = oService.getOrderById(id);
    		OrderResponseDTO ord = OrderMapper.toResponseDTO(oEntity);
    		return new ResponseEntity<>(ord,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
    		oService.deleteOrder(id);
    		return new ResponseEntity<>("Order deleted Successfully",HttpStatus.OK);
    }
}
