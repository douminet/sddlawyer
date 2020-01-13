package com.sddlawyer.services.impl;

import java.util.List;

import com.sddlawyer.dao.PersonDao;
import com.sddlawyer.factory.PersonDaoFactory;
import com.sddlawyer.services.PersonService;
import com.sddlawyer.vo.Person;

public class PersonServiceImpl implements PersonService {

	public void addPerson(Person person) {
		PersonDao dao = PersonDaoFactory.getInstance().getDao();
		dao.addPerson(person);

	}

	public void delPerson(int id) {
		PersonDao dao = PersonDaoFactory.getInstance().getDao();
		dao.delPerson(id);

	}

	public List<Person> findAllPerson() {
		PersonDao dao = PersonDaoFactory.getInstance().getDao();
		List<Person> list = dao.findAllPerson();
		return list;
	}

	public Person findOnePerson(int id) {
		PersonDao dao = PersonDaoFactory.getInstance().getDao();
		Person person = dao.findOnePerson(id);
		return person;
	}

	public void updatePerson(Person person) {
		PersonDao dao = PersonDaoFactory.getInstance().getDao();
		dao.updatePerson(person);

	}

}
