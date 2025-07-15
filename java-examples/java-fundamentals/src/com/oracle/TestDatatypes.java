package com.oracle;

public class TestDatatypes {
	public static void main(String[] args) {
		/*
		 * Datatypes - they specify what type of data a variable
		 * can store
		 * Primitives - byte(1), short(2), int(4), long(8), 
		 * 				float(4), double(8)
		 * 				char(2), boolean(1/not-determined)
		 * Non-Primitives - arrays, classes, interfaces
		 */
		int customerId = 12345;
		String name = "Siddharth";
		long phoneNo = 9876543222L;
		char gender = 'M';
		boolean isEmployed = true;
		double salary = 50000.0;
		String[] idProof = {"PAN", "Aadhar"};
		System.out.println("*** Customer Details *****");
		System.out.println("Id = "+customerId+", Name = "+name);
		System.out.println("Gender = "+gender+", Phone no = "+phoneNo);
		System.out.println("Is Employed = "+isEmployed+", Salary = "+salary);
		System.out.println("Proof's = "+idProof[0]+", "+idProof[1]);
	}
}
