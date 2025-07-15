package com.oracle;

class Person { } 
class Emp extends Person { } 
class Customer extends Person { } 
class Student extends Person { } 
class Manager extends Emp { } 
class Programmer extends Emp {}

public class TestTypeCasting {
	public static void main(String[] args) {
		Emp e = new Emp();	Customer c = new Customer();
		Student s = new Student(); // S -> P
		Manager m = new Manager(); // M -> E -> P
		print(m);
	}
	public static void print(Person p) { // p = m;
		if(p instanceof Emp) {
			Emp e2 = (Emp)p; // Explict downcasting // Emp = Manager
			System.out.println("inside if: instance of Emp");
		}
		System.out.println("outside if");
	}
}
