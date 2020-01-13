package com.sddlawyer.factory;

import com.sddlawyer.services.PersonService;
import com.sddlawyer.services.impl.PersonServiceImpl;

public class PersonServiceFactory {
	
	private static PersonServiceFactory factory;
	
	public static PersonServiceFactory getInstance(){
		factory = new PersonServiceFactory();
		return factory;
	}
	
	public PersonService getService(){
		return new PersonServiceImpl();
	}

}
