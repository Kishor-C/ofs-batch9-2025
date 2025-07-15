package com.oracle;

public class TestConditionsAndLoops {
	public static void main(String[] args) {
		/*
		 * Conditional Statements - if, if else, if else if ladder
		 * 							switch
		 * Loops - for, while and do while
		 */
		int[] items = {2, 5, 6, 8, 9, 11, 12, 16, 21, 23};
		for(int index = 0; index < items.length; index++) {
			if(items[index] % 3 == 0) {
				System.out.print(items[index]+" ");
			}
		}
		System.out.println();
		// for each - enhanced loop - no need of using the index
		// comparing the index with length & expression
		for(int element : items) {
			if(element % 4 == 0)
			System.out.print(element+" ");
		}
	}
}
