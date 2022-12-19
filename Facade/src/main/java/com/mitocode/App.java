package com.mitocode;

import com.mitocode.facade.CheckFacade;

public class App {
	
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("19/12/2022", "24/12/2022", "Lima", "Cancún");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("19/12/2022", "24/12/2022", "Lima", "Quito");
	}

}
