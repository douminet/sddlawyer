package com.sddlawyer.factory;

import com.sddlawyer.services.MoneyService;
import com.sddlawyer.services.impl.MoneyServiceImpl;

public class MoneyServiceFactory {
	
	private static MoneyServiceFactory factory;
	
	public static MoneyServiceFactory getInstance(){
		factory = new MoneyServiceFactory();
		return factory;
	}
	
	public MoneyService getService(){
		return new MoneyServiceImpl();
	}

}
