package com.sddlawyer.factory;

import com.sddlawyer.services.WenZhangService;
import com.sddlawyer.services.impl.WenZhangServiceImpl;

public class WenZhangServiceFactory {
	
	private static WenZhangServiceFactory factory;
	
	public static WenZhangServiceFactory getInstance(){
		factory = new WenZhangServiceFactory();
		return factory;
	}
	
	public WenZhangService getService(){
		return new WenZhangServiceImpl();
	}

}
