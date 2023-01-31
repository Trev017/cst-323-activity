package com.gcu.business;

import java.util.*;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {
	
	@Override
	public void test() {
		System.out.println("Hello from the AnotherOrdersBusinessService");
	}
	public List<OrderModel> getOrders() {
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "0000000001", "Product 1", 1.00f, 1));
		orders.add(new OrderModel(1L, "0000000002", "Product 2", 2.00f, 2));
		orders.add(new OrderModel(2L, "0000000003", "Product 3", 3.00f, 3));
		orders.add(new OrderModel(3L, "0000000004", "Product 4", 4.00f, 4));
		orders.add(new OrderModel(4L, "0000000005", "Product 5", 5.00f, 5));
		orders.add(new OrderModel(5L, "0000000006", "Test Product 6", 6.00f, 6));
		orders.add(new OrderModel(6L, "0000000007", "Test Product 7", 7.00f, 7));
		orders.add(new OrderModel(7L, "0000000008", "Test Product 8", 8.00f, 8));
		orders.add(new OrderModel(8L, "0000000009", "Test Product 9", 9.00f, 9));
		return orders;
	}
	@Override
	public void init() {
		System.out.println("In the AnotherOrdersBusinessService.init()");
	}
	@Override
	public void destroy() {
		System.out.println("In the AnotherOrdersBusinessService.destroy()");
	}
}
