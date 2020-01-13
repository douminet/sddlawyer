package com.sddlawyer.factory;

import com.sddlawyer.dao.PersonDao;
import com.sddlawyer.dao.impl.PersonDaoImpl;

public class PersonDaoFactory {
	
	private static PersonDaoFactory factory;
	
	public static PersonDaoFactory getInstance(){
		factory = new PersonDaoFactory();
		return factory;
	}
	
	public PersonDao getDao(){
		return new PersonDaoImpl();
	}

}
