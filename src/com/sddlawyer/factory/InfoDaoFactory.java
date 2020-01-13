package com.sddlawyer.factory;

import com.sddlawyer.dao.InfoDao;
import com.sddlawyer.dao.impl.InfoDaoImpl;

public class InfoDaoFactory {
	
	private static InfoDaoFactory factory;
	
	public static InfoDaoFactory getInstance(){
		factory = new InfoDaoFactory();
		return factory;
	}
	
	public InfoDao getDao(){
		return new InfoDaoImpl();
	}

}
