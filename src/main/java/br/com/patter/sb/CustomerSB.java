package br.com.patter.sb;

import br.com.pattern.beans.Customer;

public class CustomerSB {
	
	public boolean validateCustomer(Customer customer) {
		return customer.getAge() > 10;
	}
	
	public void includeCustomer(Customer customer) {
		System.out.println("customer included");
	}
	
	public void createCustomer(Customer customer) {
		validateCustomer(customer);
		includeCustomer(customer);
	}

}
