package com.oracle.entities;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class TestJPARead {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa-demo");
		// get the connection
		EntityManager manager = factory.createEntityManager();
		// to read the entity you can use named query or 
		// JPQL you can directly pass to the EntityManager 
		// createQuery methods
		// select s.rollno, s.name, s.dob from Student s
		// select s from Student s -> selects all the property
		TypedQuery<Student> query = 
				manager.createQuery("select s from Student s", Student.class);
		List<Student> list = query.getResultList();
		list.forEach(s -> System.out.println(s));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rollno");
		int rollno = scan.nextInt();
		// find generates select query where primarykey=rollno
		Student student = manager.find(Student.class, rollno); 
		System.out.println(student);
		scan.close();
		manager.close();
		factory.close();
	}
}
