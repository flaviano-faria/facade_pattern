package br.com.pattern.facade;

import br.com.patter.sb.CustomerSB;
import br.com.pattern.beans.Customer;

public class FacadeSB {
	
	public static CustomerSB getCustomerSB() {
		return new CustomerSB();
	}
	
	public void createCustomer() {
		Customer customer = new Customer();
		customer.setAge(11);
		customer.setName("name");
		
		CustomerSB customerSB = getCustomerSB();
		customerSB.createCustomer(customer);
	}

}
