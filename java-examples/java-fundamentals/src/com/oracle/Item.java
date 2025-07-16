package com.oracle;

import java.time.LocalDate;
import java.util.Objects;
// this is a java bean / pojo / model
public class Item {
	private int itemId;
	private String name;
	private double price;
	private LocalDate orderDate;
	// default & parameterized constructors
	// generate constructors from fields and super class
	public Item(int itemId, String name, double price, LocalDate orderDate) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.orderDate = orderDate;
	}
	public Item() {
		super();
	}
	// it returns string representation of the object when you print
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + ", orderDate=" + orderDate + "]";
	}
	/*
	 * equals & hashCode are methods of Object
	 * Set internally invokes hashCode & equals to avoid duplicates
	 */
	
	public int getItemId() {
		return itemId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(itemId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return itemId == other.itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
