package com.sddlawyer.dao;

import java.util.List;

import com.sddlawyer.vo.Money;

public interface MoneyDao {
	
	public void addMoney(Money money);
	public List<Money> findAllMoney();
	public void delMoney(String uuid);
	public void delMoneyByUuid(String uuid);
	public Money findByUUid(Money money);
	public void updMoney(Money money);
	public Money findByUuid(String uuid);
	public double findSumByChu();
	public double findSumByRu();
	public List<Money> findAllMoneyByDate(String date);
	public double findSumByChuByDate(String date);
	public double findSumByRuByDate(String date);

}
