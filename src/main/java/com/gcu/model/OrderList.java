package com.gcu.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

import java.util.*;

@XmlRootElement(name="orders")
public class OrderList {
	private List<OrderModel> orders = new ArrayList<OrderModel>();
	
	@XmlElement(name="order")
	public List<OrderModel> getOrders() {
		return this.orders;
	}
	public void setOrders(List<OrderModel> orders) {
		this.orders = orders;
	}
}