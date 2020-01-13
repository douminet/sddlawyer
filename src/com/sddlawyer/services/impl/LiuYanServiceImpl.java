package com.sddlawyer.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.sddlawyer.dao.LiuYanDao;
import com.sddlawyer.factory.LiuYanDaoFactory;
import com.sddlawyer.services.LiuYanService;
import com.sddlawyer.vo.LiuYan;

public class LiuYanServiceImpl implements LiuYanService {
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public void addLiuYan(LiuYan liuYan) {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		liuYan.setL_date(sdf.format(new Date()));
		liuYanDao.addLiuYan(liuYan);

	}

	public void delLiuYan(int lid) {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		liuYanDao.delLiuYan(lid);

	}

	public List<LiuYan> findAllLiuYan() {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		List<LiuYan> list = liuYanDao.findAllLiuYan();
		return list;
	}

	public LiuYan findById(int lid) {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		LiuYan liuYan = liuYanDao.findById(lid);
		return liuYan;
	}

	public List<LiuYan> findByTitle(String l_Title) {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		List<LiuYan> list = liuYanDao.findByTitle(l_Title);
		return list;
	}

	public void updateLiuYan(LiuYan liuYan) {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		liuYanDao.updateLiuYan(liuYan);

	}

	public List<LiuYan> findByPage(int currentPage, int pageSize) {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		List<LiuYan> list = liuYanDao.findByPage(currentPage, pageSize);
		return list;
	}

	public int maxPage(int pageSize) {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		int records=liuYanDao.findRecordes();
		return records%pageSize==0?records/pageSize:records/pageSize+1;
	}

	public List<LiuYan> findByLikeTitle(String l_Title) {
		LiuYanDao liuYanDao = LiuYanDaoFactory.getInstance().getDao();
		List<LiuYan> list = liuYanDao.findByLikeTitle(l_Title);
		return list;
	}

}
