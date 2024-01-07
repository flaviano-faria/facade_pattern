package br.com.pattern.app;

import br.com.pattern.facade.FacadeSB;

public class FacadeApp {
	
	public static void main(String[] args) {
		
		FacadeSB facade = new FacadeSB();
		facade.createCustomer();
		
	}

}
