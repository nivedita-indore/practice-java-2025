package com.processing.ordersAndTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderProcessing {

	public static void main(String[] args) {

		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1, 2500));
		orders.add(new Order(2, 5000));
		orders.add(new Order(3, 1500));
		orders.add(new Order(4, 7000));

		// Get high value orders (>3000)
		List<Order> highValue = orders.stream()
				.filter(o -> o.amount > 3000).collect(Collectors.toList());
		System.out.println("High Value Orders: " + highValue);

	}
}
