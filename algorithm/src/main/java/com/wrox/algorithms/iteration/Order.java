package com.wrox.algorithms.iteration;

public class Order {

	int orderNmuber;
	double price;

	public static void main(String[] args) {
		Order[] orders = new Order[10];
		for (int i = orders.length-1; i >=0 ; i--) {
			Order tempOrder = new Order();
			orders[i] = tempOrder;
			orders[i].orderNmuber = i;
			orders[i].price = i;
			System.out.println("i=" + i);
		}

	}

}
