package com.sddlawyer.dao;

import java.util.List;

import com.sddlawyer.vo.LiuYan;
import com.sddlawyer.vo.WenZhang;
import com.sddlawyer.vo.ZiDuan;

public interface LiuYanDao {
	
	public LiuYan findById(int lid);
	public List<LiuYan> findAllLiuYan();
	public void addLiuYan(LiuYan liuYan);
	public void delLiuYan(int lid);
	public void updateLiuYan(LiuYan liuYan);
	public List<LiuYan> findByTitle(String l_title);
	public List<LiuYan> findByLikeTitle(String l_title);
	public List<LiuYan> findByPage(int currentPage, int pageSize);
	public int findRecordes();

}
