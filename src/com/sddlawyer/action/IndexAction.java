package com.sddlawyer.action;

import java.util.ArrayList;
import java.util.List;

import com.sddlawyer.factory.LiuYanServiceFactory;
import com.sddlawyer.factory.PersonServiceFactory;
import com.sddlawyer.factory.WenZhangServiceFactory;
import com.sddlawyer.services.LiuYanService;
import com.sddlawyer.services.PersonService;
import com.sddlawyer.services.WenZhangService;
import com.sddlawyer.vo.LiuYan;
import com.sddlawyer.vo.Person;
import com.sddlawyer.vo.WenZhang;

public class IndexAction {
	
	private Person person;
	private List<WenZhang> fagui = new ArrayList<WenZhang>();
	private List<WenZhang> anli = new ArrayList<WenZhang>();
	private List<WenZhang> zhongcai = new ArrayList<WenZhang>();
	private List<WenZhang> xinwen = new ArrayList<WenZhang>();
	private List<WenZhang> susong = new ArrayList<WenZhang>();
	private List<LiuYan> liuyan = new ArrayList<LiuYan>();
	
	private WenZhangService wzService = WenZhangServiceFactory.getInstance().getService();
	private PersonService pService = PersonServiceFactory.getInstance().getService();
	private LiuYanService lService = LiuYanServiceFactory.getInstance().getService();
	
	public List<WenZhang> cutTitle(List<WenZhang> list){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getTitle().length()>24){
				list.get(i).setTitle(list.get(i).getTitle().substring(0, 21)+"…");
			}
		}
		return list;
	}
	
	public List<LiuYan> cutTitleLY(List<LiuYan> list){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getL_title().length()>24){
				list.get(i).setL_title(list.get(i).getL_title().substring(0, 21)+"…");
			}
		}
		return list;
	}
	
	
	public String enterIndex(){
		person = pService.findOnePerson(1);
		fagui = this.cutTitle(wzService.findByPage(1, 7, "fagui"));
		anli = this.cutTitle(wzService.findByPage(1, 7, "anli"));
		zhongcai = this.cutTitle(wzService.findByPage(1, 7, "zhongcai"));
		xinwen = this.cutTitle(wzService.findByPage(1, 7, "xinwen"));
		susong = this.cutTitle(wzService.findByPage(1, 7, "susong"));
		liuyan = this.cutTitleLY(lService.findByPage(1, 7));
		return "enterIndex";
	}
	
	
	
	
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}






	public List<WenZhang> getFagui() {
		return fagui;
	}






	public void setFagui(List<WenZhang> fagui) {
		this.fagui = fagui;
	}






	public List<WenZhang> getAnli() {
		return anli;
	}






	public void setAnli(List<WenZhang> anli) {
		this.anli = anli;
	}






	public List<WenZhang> getZhongcai() {
		return zhongcai;
	}






	public void setZhongcai(List<WenZhang> zhongcai) {
		this.zhongcai = zhongcai;
	}






	public List<WenZhang> getXinwen() {
		return xinwen;
	}






	public void setXinwen(List<WenZhang> xinwen) {
		this.xinwen = xinwen;
	}






	public List<WenZhang> getSusong() {
		return susong;
	}






	public void setSusong(List<WenZhang> susong) {
		this.susong = susong;
	}






	public List<LiuYan> getLiuyan() {
		return liuyan;
	}






	public void setLiuyan(List<LiuYan> liuyan) {
		this.liuyan = liuyan;
	}
	
}
