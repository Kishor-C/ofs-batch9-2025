package com.oracle;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestItemSorting {
	public static void main(String[] args) {
		
		Set<Item> set = new TreeSet<>((x, y) -> Integer.compare(y.getItemId(), x.getItemId()));
		set.add(new Item(2, "Laptop2", 40000, LocalDate.now()));
		set.add(new Item(3, "Laptop3", 30000, LocalDate.now()));
		set.add(new Item(5, "Laptop5", 50000, LocalDate.now()));
		set.add(new Item(1, "Laptop1", 10000, LocalDate.now()));
		
		System.out.println(set);
		
		System.out.println("------------------------------");
		
		List<Item> itemList = List.of(
				new Item(7, "Laptop", 45000, LocalDate.parse("2024-12-24")),
				new Item(6, "Mobile", 75000, LocalDate.parse("2023-11-27")),
				new Item(8, "Shoes", 15000, LocalDate.parse("2025-01-15")),
				new Item(4, "Bag", 5000, LocalDate.parse("2022-10-02"))
				);
		//lambda expressions & streams to get the results in one line
		// void accept(T t); (t) -> 
		print(itemList);
		// sort and collect in another List
		// Comparator<T> : int compare(T t1, T t2) : (t1, t2) -> expression
		List<Item> sortedItems = 
		itemList
		.stream()
		.sorted((t1, t2)->t1.getName().compareTo(t2.getName()))
		.collect(Collectors.toList());
		print(sortedItems);
	}
	public static void print(List<Item> items) {
		items.forEach(t -> System.out.println(t));
		System.out.println("_______________________________________-");
	}
}
