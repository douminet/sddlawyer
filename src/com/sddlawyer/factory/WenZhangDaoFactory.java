package com.sddlawyer.factory;

import com.sddlawyer.dao.WenZhangDao;
import com.sddlawyer.dao.impl.WenZhangDaoImpl;

public class WenZhangDaoFactory {
	
	private static WenZhangDaoFactory factory;
	
	public static WenZhangDaoFactory getInstance(){
		factory = new WenZhangDaoFactory();
		return factory;
	}
	
	public WenZhangDao getDao(){
		return new WenZhangDaoImpl();
	}

}
