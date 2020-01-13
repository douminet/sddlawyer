package com.sddlawyer.factory;

import com.sddlawyer.services.LiuYanService;
import com.sddlawyer.services.impl.LiuYanServiceImpl;

public class LiuYanServiceFactory {
	
private static LiuYanServiceFactory factory;
	
	public static LiuYanServiceFactory getInstance(){
		factory = new LiuYanServiceFactory();
		return factory;
	}
	
	public LiuYanService getService(){
		return new LiuYanServiceImpl();
	}

}
