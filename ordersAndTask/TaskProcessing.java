package com.processing.ordersAndTask;

import java.util.LinkedList;
import java.util.Queue;

public class TaskProcessing {
	public static void main(String[] args) {

		Queue<String> tasks = new LinkedList<String>();

		// Adding tasks
		tasks.offer("Task1 - Validate Data");
		tasks.offer("Task2 - Process Payment");
		tasks.offer("Task3 - Send Notification");

		// Processing tasks (FIFO)
		while (!tasks.isEmpty()) {
			System.out.println("Processing: " + tasks.poll());
		}
	}
}
