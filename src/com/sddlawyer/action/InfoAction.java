package com.sddlawyer.action;

import com.sddlawyer.factory.InfoServiceFactory;
import com.sddlawyer.factory.PersonServiceFactory;
import com.sddlawyer.services.InfoService;
import com.sddlawyer.services.PersonService;
import com.sddlawyer.vo.Info;
import com.sddlawyer.vo.Person;

public class InfoAction {
	
	InfoService service = InfoServiceFactory.getInstance().getService();
	private PersonService pService = PersonServiceFactory.getInstance().getService();
	private Person person;
	Info info = new Info();
	
	public String enterInfo(){
		info = service.findOneInfo(1);
		person = pService.findOnePerson(1);
		return "enterinfo";
	}
	
	public String enterInfoByAdmin(){
		info = service.findOneInfo(1);
		return "enterinfobyadmin";
	}
	
	public String enterUpdInfo(){
		info = service.findOneInfo(info.getIid());
		return "enterupdinfo";
	}
	public String updInfo(){
		service.updateInfo(info);
		return "updInfoSuccess";
	}
	
	
	

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}
