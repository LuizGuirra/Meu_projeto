package Entities__Java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities__Enums.Order_Status;

public class Order_ {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private Order_Status status;
	
	private Cliente client;
	
	private List<Order_Item> items = new ArrayList<Order_Item>();
	
	public Order_() {
	}
	public Order_(Date moment, Order_Status status, Cliente client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public Order_Status getStatus() {
		return status;
	}
	public void setStatus(Order_Status status) {
		this.status = status;
	}
	public Cliente getClient() {
		return client;
	}
	public void setClient(Cliente client) {
		this.client = client;
	}
	public void addItem(Order_Item item) {
		items.add(item);
	}
	public void removeItem(Order_Item item) {
		items.remove(item);
	}
	public double total() {
		double sum = 0.0;
		for (Order_Item it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for(Order_Item item: items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
