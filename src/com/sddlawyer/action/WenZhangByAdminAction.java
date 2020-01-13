package com.sddlawyer.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.sddlawyer.factory.PersonServiceFactory;
import com.sddlawyer.factory.WenZhangServiceFactory;
import com.sddlawyer.services.PersonService;
import com.sddlawyer.services.WenZhangService;
import com.sddlawyer.vo.Person;
import com.sddlawyer.vo.WenZhang;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class WenZhangByAdminAction {
	
	WenZhangService wenService = WenZhangServiceFactory.getInstance().getService();
	WenZhang wenZhang = new WenZhang();
	List<WenZhang> wens = new ArrayList<WenZhang>();
	String lanmu;
	String tablename;
	private int currentPage;
	private int maxPage;
	private int pageSize=16;
	private List<Integer> pages;
	private PersonService pService = PersonServiceFactory.getInstance().getService();
	private Person person;
	
	public String findByPage(){
		this.whichLanMu();
		System.out.println("running one");
		wens = wenService.findByPage(currentPage, pageSize, tablename);
		person = pService.findOnePerson(1);
		maxPage=wenService.maxPage(tablename,pageSize);
		pages=new ArrayList<Integer>();
		for(int i=1;i<=maxPage;i++){
			pages.add(i);
		}
		return "findByPage";
	}
	
	public void findByAjax() throws IOException{
		System.out.println("running two");
		  HttpServletRequest request = ServletActionContext.getRequest();

	      HttpServletResponse response = ServletActionContext.getResponse();
		this.whichLanMu();
		wens = wenService.findByPage(currentPage, pageSize, tablename);
		System.out.println("running three");
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = null;
		System.out.println("out1 run");
		out = response.getWriter();
		System.out.println("out run");
		System.out.println(out.toString());
		out.write("hello world");
		out.flush();
		out.close();
		System.out.println("wenssize:"+wens.size());
		//JSONArray arr = JSONArray.fromObject(wens);
		//System.out.println("arr:"+arr.size());

		
	
		
		
	}
	
	public static void main(String[] args){
		
		WenZhangByAdminAction action = new WenZhangByAdminAction();
		action.setCurrentPage(1);
		action.setTablename("fagui");
		//action.findByAjax();
	}
	
	public String findAllWenZhang(){
		this.whichLanMu();
		wens = wenService.findAllWenZhang(tablename);
		return "wenzhangAll";
	}
	
	public String enterAdd(){
		this.whichLanMu();
		return "enterAdd";
	}
	
	public String enterUpd(){
		this.whichLanMu();
		wenZhang = wenService.findById(wenZhang.getId(), tablename);
		return "enterUpd";
	}
	
	public String addWenZhang(){
		this.whichLanMu();
		
		/*wenZhang.setMain(wenService.turn(wenZhang.getMain()));*/
		System.out.println("main:"+wenZhang.getMain());
		wenService.addWenZhang(wenZhang, tablename);
		return "addSuccess";
	}
	
	public String updWenZhang(){
		this.whichLanMu();
		wenService.updateWenZhang(wenZhang, tablename);
		return "updSuccess";
	}
	
	public String enterWenZhang(){
		this.whichLanMu();
		wenZhang = wenService.findById(wenZhang.getId(), tablename);
		person = pService.findOnePerson(1);
		return "enterWenZhang";
	}
	
	public String delWenZhang(){
		wenService.delWenZhang(wenZhang.getId(), tablename);
		return "delSuccess";
	}
	
	public void whichLanMu(){
		if(tablename.equals("fagui")){
			lanmu = "劳动法规";
		}else if(tablename.equals("zhongcai")){
			lanmu = "劳动仲裁";
		}if(tablename.equals("susong")){
			lanmu = "劳动诉讼";
		}if(tablename.equals("anli")){
			lanmu = "经典案例";
		}if(tablename.equals("xinwen")){
			lanmu = "新闻资讯";
		}
	}
	
	

	public WenZhang getWenZhang() {
		return wenZhang;
	}

	public void setWenZhang(WenZhang wenZhang) {
		this.wenZhang = wenZhang;
	}

	
	
	public List<WenZhang> getWens() {
		return wens;
	}

	public void setWens(List<WenZhang> wens) {
		this.wens = wens;
	}

	public String getLanmu() {
		return lanmu;
	}

	public void setLanmu(String lanmu) {
		this.lanmu = lanmu;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
	

}
