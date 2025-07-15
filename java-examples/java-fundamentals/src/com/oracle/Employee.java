package com.oracle;
// id, name, salary
public class Employee {
	private int id;
	private String name;
	private double salary;
	// constructor to initialize id, name and salary
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// getters and setters - but no setters for id
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	
}
