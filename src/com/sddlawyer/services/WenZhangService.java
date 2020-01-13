package com.sddlawyer.services;

import java.util.List;

import com.sddlawyer.vo.WenZhang;

public interface WenZhangService {
	
	public List<WenZhang> findAllWenZhang(String tablename);
	public WenZhang findById(int id,String tablename);
	public void addWenZhang(WenZhang wenZhang, String tablename);
	public void delWenZhang(int id, String tablename);
	public void updateWenZhang(WenZhang wenZhang, String tablename);
	public List<WenZhang> findByTitle(String title, String tablename);
	public List<WenZhang> findByPage(int currentPage, int pageSize,String tablename);
	public int maxPage(String tablename,int pageSize);

}
