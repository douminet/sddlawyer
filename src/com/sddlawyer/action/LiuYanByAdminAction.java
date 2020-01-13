package com.sddlawyer.action;

import java.util.ArrayList;
import java.util.List;

import com.sddlawyer.factory.HuiFuFactory;
import com.sddlawyer.factory.LiuYanServiceFactory;
import com.sddlawyer.factory.PersonServiceFactory;
import com.sddlawyer.services.HuiFuService;
import com.sddlawyer.services.LiuYanService;
import com.sddlawyer.services.PersonService;
import com.sddlawyer.vo.HuiFu;
import com.sddlawyer.vo.LiuYan;
import com.sddlawyer.vo.Person;

public class LiuYanByAdminAction {
	
	LiuYanService liuYanService = LiuYanServiceFactory.getInstance().getService();
	HuiFuService huiFuService = HuiFuFactory.getInstance().getService();
	List<LiuYan> liuYans = new ArrayList<LiuYan>();
	List<HuiFu> huiFus = new ArrayList<HuiFu>();
	LiuYan liuYan = new LiuYan();
	HuiFu huiFu = new HuiFu();
	String name;
	private int currentPage;
	private int maxPage;
	private int pageSize=16;
	private List<Integer> pages;
	private PersonService pService = PersonServiceFactory.getInstance().getService();
	private Person person;
	
	public String findByPage(){
		liuYans = liuYanService.findByPage(currentPage, pageSize);
		person = pService.findOnePerson(1);
		maxPage=liuYanService.maxPage(pageSize);
		pages=new ArrayList<Integer>();
		for(int i=1;i<=maxPage;i++){
			pages.add(i);
		}
		return "findByPage";
	}
	
	public String findById(){
		liuYan = liuYanService.findById(liuYan.getLid());
		huiFus = huiFuService.findByLid(liuYan.getLid());
		person = pService.findOnePerson(1);
		return "findById";
	}
	
	public String findAllLiuYan(){
		liuYans = liuYanService.findAllLiuYan();
		return "liuYanAll";
	}
	
	public String addLiuYan(){
		person = pService.findOnePerson(1);
		List<LiuYan> liuYans = liuYanService.findAllLiuYan();
		int id = liuYans.size()==0?1:liuYans.get(liuYans.size()-1).getLid()+1;
		liuYan.setLid(id);
		liuYanService.addLiuYan(liuYan);
		List<HuiFu> huiFus = huiFuService.findAllHuiFu();
		int hid = huiFus.size()==0?1:huiFus.get(huiFus.size()-1).getHid()+1;
		huiFu.setHid(hid);
		huiFu.setLid(liuYan.getLid());
		huiFu.setH_name(liuYan.getL_name());
		huiFu.setH_main(liuYan.getL_main());
		huiFuService.addHuiFu(huiFu);
		return "addSuccess";
	}
	
	public String addHuiFu(){
		List<HuiFu> huiFus = huiFuService.findAllHuiFu();
		int id = huiFus.size()==0?1:huiFus.get(huiFus.size()-1).getHid()+1;
		huiFu.setHid(id);
		huiFuService.addHuiFu(huiFu);
		return "addSuccess";
	}
	
	
	
	public String delLiuYan(){
		liuYanService.delLiuYan(liuYan.getLid());
		huiFuService.delHuiFuByLid(liuYan.getLid());
		return "delSuccess";
	}
	
	public String delHuiFuById(){
		huiFuService.delHuiFu(huiFu.getHid());
		return "delHuiFuSuc";
	}
	
	
	
	public String enterLiuYan(){
		liuYan = liuYanService.findById(liuYan.getLid());
		return "enterLiuYan";
	}
	
	public String enterAddLiuYan(){
		person = pService.findOnePerson(1);
		return "enterAddLiuYan";
	}
	
	
	
	
	public LiuYanService getLiuYanService() {
		return liuYanService;
	}
	public void setLiuYanService(LiuYanService liuYanService) {
		this.liuYanService = liuYanService;
	}
	public List<LiuYan> getLiuYans() {
		return liuYans;
	}
	public void setLiuYans(List<LiuYan> liuYans) {
		this.liuYans = liuYans;
	}
	public LiuYan getLiuYan() {
		return liuYan;
	}
	public void setLiuYan(LiuYan liuYan) {
		this.liuYan = liuYan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Integer> getPages() {
		return pages;
	}

	public void setPages(List<Integer> pages) {
		this.pages = pages;
	}

	public List<HuiFu> getHuiFus() {
		return huiFus;
	}

	public void setHuiFus(List<HuiFu> huiFus) {
		this.huiFus = huiFus;
	}

	public HuiFu getHuiFu() {
		return huiFu;
	}

	public void setHuiFu(HuiFu huiFu) {
		this.huiFu = huiFu;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	
	
	
	
}
