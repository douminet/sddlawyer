package com.sddlawyer.factory;

import com.sddlawyer.services.InfoService;
import com.sddlawyer.services.impl.InfoServiceImpl;

public class InfoServiceFactory {
	
	private static InfoServiceFactory factory;
	
	public static InfoServiceFactory getInstance(){
		factory = new InfoServiceFactory();
		return factory;
	}
	
	public InfoService getService(){
		return new InfoServiceImpl();
	}

}
