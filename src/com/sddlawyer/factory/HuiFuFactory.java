package com.sddlawyer.factory;

import com.sddlawyer.dao.HuiFuDao;
import com.sddlawyer.dao.impl.HuiFuDaoImpl;
import com.sddlawyer.services.HuiFuService;
import com.sddlawyer.services.impl.HuiFuServiceImpl;

public class HuiFuFactory {
	
	public static HuiFuFactory factory;
	
	public static HuiFuFactory getInstance(){
		factory = new HuiFuFactory();
		return factory;
	}
	
	public HuiFuDao getDao(){
		return new HuiFuDaoImpl();
	}
	
	public HuiFuService getService(){
		return new HuiFuServiceImpl();
	}

}
