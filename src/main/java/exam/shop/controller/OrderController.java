package exam.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import exam.shop.dto.Order;

public class OrderController {

	@RequestMapping(value="/orderItem.shop")
	public void orderItems(Order order){
		
	}
}

