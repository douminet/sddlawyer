package com.sddlawyer.services;

import java.util.List;

import com.sddlawyer.vo.LiuYan;
import com.sddlawyer.vo.WenZhang;

public interface LiuYanService {
	
	public List<LiuYan> findAllLiuYan();
	public LiuYan findById(int lid);
	public void addLiuYan(LiuYan liuYan);
	public void delLiuYan(int lid);
	public void updateLiuYan(LiuYan liuYan);
	public List<LiuYan> findByTitle(String l_title);
	public List<LiuYan> findByLikeTitle(String l_title);
	public List<LiuYan> findByPage(int currentPage, int pageSize);
	public int maxPage(int pageSize);

}
