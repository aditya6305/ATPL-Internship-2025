package com.aaslin.java.assignments.assignment6;
import java.util.*;
public class CustomerQueue {
		Queue<String> queue=new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		public void service() {
			while(true) {
			System.out.println("1.Enter the customer into the  queue");
			System.out.println("2.Serve the customer");
			System.out.println("3.Provide service to next customer");
			System.out.println("4.Customer left the queue");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 1:
					addCustomer();
					break;
				case 2:
					serveCustomer();
					break;
				case 3:
					nextCustomer();
					break;
				case 4:
					System.out.println("Customers in the queue are:"+queue);
					break;
				default:
					System.out.println("Enter numbers between 1-4");
		}
	}
}		
public void addCustomer() {
	System.out.println("Enter customer name:");
	String name = scanner.nextLine();
	queue.add(name);
	System.out.println(name+" is added to the queue");
}
public void serveCustomer() {
	if(!queue.isEmpty()) {
		String served = queue.poll();
		System.out.println(served+" is served");
	}
	else {
		System.out.println("Queue is empty");
	}
}
public void nextCustomer() {
	if(!queue.isEmpty()) {
		System.out.println("Next customer is:"+queue.peek());
	}
	else {
		System.out.println("No customer is in the queue");
	}
}
public static void main(String[] args) {
	CustomerQueue customerqueue = new CustomerQueue();
	customerqueue.service();
}
}