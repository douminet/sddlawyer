package com.sddlawyer.dao;

import java.util.List;

import com.sddlawyer.vo.WenZhang;
import com.sddlawyer.vo.ZiDuan;

public interface WenZhangDao {
	
	public WenZhang findById(int id,String tablename);
	public List<WenZhang> findAllWenZhang(String tablename);
	public void addWenZhang(WenZhang wenZhang,String tablename);
	public void delWenZhang(int id,String tablename);
	public void updateWenZhang(WenZhang wenZhang,String tablename);
	public List<WenZhang> findByTitle(String title,String tablename);
	public ZiDuan makeCname(String tablename);
	public List<WenZhang> findByPage(int currentPage, int pageSize,String tablename);
	public int findRecordes(String tablename);

}
