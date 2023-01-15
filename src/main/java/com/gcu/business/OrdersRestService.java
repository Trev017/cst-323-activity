package com.gcu.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

import com.gcu.model.*;

@RestController
@RequestMapping("/service")
public class OrdersRestService {
	@Autowired
	OrdersBusinessServiceInterface service;
	
	@GetMapping(path="/getjson", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<OrderModel> getOrdersAsJson() {
		return service.getOrders();
	}
	@GetMapping(path="/getxml", produces= {MediaType.APPLICATION_XML_VALUE})
	public OrderList getOrdersAsXml() {
		OrderList list = new OrderList();
		list.setOrders(service.getOrders());
		return list;
	}
	/*
	@GetMapping(path="/gettest", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<OrderModel> getErrorAsJson() {
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			
		}
	}
	*/
}
