package com.sddlawyer.action;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.sddlawyer.factory.MoneyServiceFactory;
import com.sddlawyer.services.MoneyService;
import com.sddlawyer.vo.Money;

public class MoneyAction {
	
	Money money = new Money();
	List<Money> list = new ArrayList<Money>();
	double chuSum = 0;
	double ruSum =0;
	double s = 0;
	String sum ="";
	String inputDateString;
	MoneyService service = MoneyServiceFactory.getInstance().getService();
	DecimalFormat df = new DecimalFormat("######0.00");
	ActionContext ctx = ActionContext.getContext();

	HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
	
	public String account(){
		System.out.println(money.getDate());
		System.out.println(money.getUse());
		service.addMoney(money);
		
		return "success";
	}
	
	public String listMoney(){
		SimpleDateFormat   sDateFormat = new SimpleDateFormat("yyyy-MM");   
		String date =sDateFormat.format(new java.util.Date());
		list = service.findAllMoneyByDate(date);
		chuSum = service.findSumByChuByDate(date);
		ruSum = service.findSumByRuByDate(date);
		s = ruSum - chuSum;
		sum = df.format(s);
		return "success";
	}
	
	public String listMoneyByDate(){
		list = service.findAllMoneyByDate(inputDateString);
		chuSum = service.findSumByChuByDate(inputDateString);
		ruSum = service.findSumByRuByDate(inputDateString);
		s = ruSum - chuSum;
		sum = df.format(s);
		return "success";
	}
	
	public String editByUuid(){
		String uuid = request.getParameter("uuid");
		System.out.println("uuid:"+uuid);
		money = service.findByUuid(uuid);
		System.out.println("uuid2:"+money.getUuid());
		System.out.println("use:"+money.getUse());
		return "success";
	}
	
	public String updateByUuid(){
		System.out.println("money.use:"+money.use);
		service.updMoney(money);
		return "success";
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public List<Money> getList() {
		return list;
	}

	public void setList(List<Money> list) {
		this.list = list;
	}

	public double getChuSum() {
		return chuSum;
	}

	public void setChuSum(double chuSum) {
		this.chuSum = chuSum;
	}

	public double getRuSum() {
		return ruSum;
	}

	public void setRuSum(double ruSum) {
		this.ruSum = ruSum;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getInputDateString() {
		return inputDateString;
	}

	public void setInputDateString(String inputDateString) {
		this.inputDateString = inputDateString;
	}

	
	
	
	

}
