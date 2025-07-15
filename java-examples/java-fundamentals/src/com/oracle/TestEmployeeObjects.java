package com.oracle;

public class TestEmployeeObjects {
	public static void main(String[] args) {
		// Type variable = new Type(arg1, arg2, arg3);
		Employee employee1 = new Employee(123, "Atharv", 42500);
		Employee employee2 = new Employee(456, "Siddharth", 62500);
		Employee employee3 = new Employee(789, "Vishnu", 72500);
		//System.out.println(employee1);
		print(employee1);
		print(employee2);
		print(employee3);
		
	}
	public static void print(Employee e) {
		System.out.println("Name="+e.getName()+
				", Id="+e.getId()+", Salary="+e.getSalary());
	}
}
