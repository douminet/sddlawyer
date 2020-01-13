package com.sddlawyer.dao;

import java.util.List;

import com.sddlawyer.vo.Info;

public interface InfoDao {
	public void addInfo(Info info);
	public void delInfo(int iid);
	public void updateInfo(Info info);
	public List<Info> findAllInfo(); 
	public Info findOneInfo(int id);

}
