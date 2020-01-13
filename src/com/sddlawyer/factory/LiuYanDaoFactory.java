package com.sddlawyer.factory;

import com.sddlawyer.dao.LiuYanDao;
import com.sddlawyer.dao.impl.LiuYanDaoImpl;


public class LiuYanDaoFactory {
	
private static LiuYanDaoFactory factory;
	
	public static LiuYanDaoFactory getInstance(){
		factory = new LiuYanDaoFactory();
		return factory;
	}
	
	public LiuYanDao getDao(){
		return new LiuYanDaoImpl();
	}

}
