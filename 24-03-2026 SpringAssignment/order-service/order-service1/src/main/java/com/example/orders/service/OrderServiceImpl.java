package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository oRepo;
	
    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
    		OrderEntity oe= oRepo.save(OrderMapper.toEntity(request));
        return oe;
    }

    @Override
    public OrderEntity getOrderById(Long id) {
    		OrderEntity order = oRepo.findById(id).orElse(null);
    		if(order!=null) {
    			return order;
    		}else {
    			throw new OrderNotFoundException();
    		}
    }

    @Override
    public void deleteOrder(Long id) {
        if(oRepo.existsById(id)) {
        		oRepo.deleteById(id);
        }else {
			throw new OrderNotFoundException();
		}
    }
}
