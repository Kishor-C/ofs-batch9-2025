package com.oracle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class TestDateTime {
	public static void main(String[] args) {
		/*
		 * Don't use Date & Timestamp classes from java.util or 
		 * java.sql
		 * You need to use Date & Time class from java.time package
		 */
		LocalDate today = LocalDate.now();
		System.out.println(today+", Year: "+today.getYear());
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow);
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
	}
}	
