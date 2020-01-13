package com.sddlawyer.dao;

import java.util.List;

import com.sddlawyer.vo.Info;
import com.sddlawyer.vo.Person;

public interface PersonDao {
	
	public void addPerson(Person person);
	public void delPerson(int id);
	public void updatePerson(Person person);
	public List<Person> findAllPerson(); 
	public Person findOnePerson(int id);

}
