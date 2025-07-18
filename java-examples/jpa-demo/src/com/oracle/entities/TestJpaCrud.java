package com.oracle.entities;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestJpaCrud {
	public static void main(String[] args) {
		/*
		 * In JPA you don't use JDBC API's
		 * You get connection from EntityManagerFactory
		 * You need to use EntityTransaction for persist()
		 * delete() and update() - DML
		 * EntityManager has CRUD methods like persist(), get()
		 * createNamedQuery(), update() and so on
		 */
		//check the name of the persistence-unit in persistence.xml
		// jpa-demo in my case, but in your case it might be different
		// import all the api's from jakarta.persistence
		// refer to the connection pool
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa-demo");
		// get the connection
		EntityManager manager = factory.createEntityManager();
		// create transaction & begin that for DML operations
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		// create student object to persist
		Student student1 = new Student();
		student1.setName("Siddharth");
		student1.setDob(LocalDate.parse("2019-03-26"));
		// rollno is using sequence so its auto-generated
		manager.persist(student1); // stores but you need to commit
		transaction.commit();
		// close the connection & connection pool resources
		manager.close(); // it returns the connection back to pool
		factory.close(); 
		System.out.println("DONE");
		// add ojdbc8.jar in your project
		// BuildPath -> Libraries -> Classpath -> Add External Jars
	}
}
