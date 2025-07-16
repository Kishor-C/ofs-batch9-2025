package com.oracle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TestItemSet {
	public static void main(String[] args) {
		/*
		 * Set<T> itemList = new HashSet<T>();
		 * add(t), remove(index), remove(t), iterator()
		 * take input from the keyboard, but date must be 
		 * in yyyy-MM-dd format which is an ISO format
		 * date - use LocalDate.parse(stringDate) to pass the date
		 */
		// test whether you can duplicate item to the Set<Item>
		Set<Item> itemList = new HashSet<Item>();//RO
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of items to store:-");
		// use this size to iterate in the for loop to create item
		int size = scan.nextInt();
		for(int i = 0; i < size; i++) {
			System.out.println("Enter id, name, price, order-date");
			System.out.println("Date must be in yyyy-MM-dd format");
			//Item(int, String, double, LocalDate)
			Item item = new Item(
					scan.nextInt(), scan.next(), scan.nextDouble(),
					LocalDate.parse(scan.next())
					);
			// add the item to the itemList
			itemList.add(item);
			System.out.println("-------- Item added ------");
		}
		System.out.println("Items in the list are:-");
		//for each can iterate over collection 
		for(Item element : itemList) {
			System.out.println(element);
		}
		// keep this at the end of the main()
		scan.close();
	}
}
