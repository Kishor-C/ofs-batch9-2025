package com.oracle.entities.two;

import com.oracle.service.CustomerService;
import com.oracle.service.CustomerServiceImpl;

public class MainController {
	public static void main(String[] args) {
		// avoid using
		CustomerService service = new CustomerServiceImpl();
		// instead use interface reference
		//CustomerService service2 = new CustomerServiceImpl();
	}
}
