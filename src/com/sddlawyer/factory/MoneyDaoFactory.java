package com.sddlawyer.factory;

import com.sddlawyer.dao.MoneyDao;
import com.sddlawyer.dao.impl.MoneyDaoImpl;

public class MoneyDaoFactory {
	
	private static MoneyDaoFactory factory;
	
	public static MoneyDaoFactory getInstance(){
		factory = new MoneyDaoFactory();
		return factory;
	}
	
	public MoneyDao getDao(){
		return new MoneyDaoImpl();
	}

}
