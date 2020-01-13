package com.sddlawyer.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.sddlawyer.dao.MoneyDao;
import com.sddlawyer.factory.MoneyDaoFactory;
import com.sddlawyer.services.MoneyService;
import com.sddlawyer.vo.Money;

public class MoneyServiceImpl implements MoneyService {
	
	MoneyDao dao = MoneyDaoFactory.getInstance().getDao();

	public void addMoney(Money money) {
		// TODO Auto-generated method stub
		
		dao.addMoney(money);

	}

	public List<Money> findAllMoney() {
		List<Money> list = new ArrayList<Money>();
		list = dao.findAllMoney();
		return list;
	}

	public void delMoney(String uuid) {
		// TODO Auto-generated method stub

	}

	public void delMoneyByUuid(String uuid) {
		// TODO Auto-generated method stub

	}

	public Money findByUUid(Money money) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updMoney(Money money) {
		dao.updMoney(money);

	}

	public Money findByUuid(String uuid) {
		Money money = dao.findByUuid(uuid);
		return money;
	}

	public double findSumByChu() {
		double sum = dao.findSumByChu();
		return sum;
	}

	public double findSumByRu() {
		double sum = dao.findSumByRu();
		return sum;
	}

	public List<Money> findAllMoneyByDate(String date) {
		List<Money> list = new ArrayList<Money>();
		list = dao.findAllMoneyByDate(date);
		return list;
	}

	public double findSumByChuByDate(String date) {
		double sum = dao.findSumByChuByDate(date);
		return sum;
	}

	public double findSumByRuByDate(String date) {
		double sum = dao.findSumByRuByDate(date);
		return sum;
	}

}
