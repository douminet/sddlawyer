package com.sddlawyer.action;

import com.sddlawyer.factory.PersonServiceFactory;
import com.sddlawyer.services.PersonService;
import com.sddlawyer.vo.Person;

public class PersonAction {
	
	PersonService service = PersonServiceFactory.getInstance().getService();
	Person person = new Person();
	
	
	public String findPerson(){
		person = service.findOnePerson(1);
		return "findPerson";
	}

	public String enterUpdPerson(){
		person = service.findOnePerson(person.getId());
		return "enterupdperson";
	}
	
	public String updPerson(){
		service.updatePerson(person);
		return "updPersonSuccess";
	}
	
	
	

	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}
