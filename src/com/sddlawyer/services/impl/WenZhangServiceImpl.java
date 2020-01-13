package com.sddlawyer.services.impl;

import java.util.List;

import com.sddlawyer.dao.WenZhangDao;
import com.sddlawyer.factory.WenZhangDaoFactory;
import com.sddlawyer.services.WenZhangService;
import com.sddlawyer.vo.WenZhang;

public class WenZhangServiceImpl implements WenZhangService{

	public void addWenZhang(WenZhang wenZhang, String tablename) {
		WenZhangDao wenDao = WenZhangDaoFactory.getInstance().getDao();
		wenDao.addWenZhang(wenZhang, tablename);
		
	}

	public void delWenZhang(int id, String tablename) {
		WenZhangDao wenDao = WenZhangDaoFactory.getInstance().getDao();
		wenDao.delWenZhang(id, tablename);
		
	}

	public List<WenZhang> findAllWenZhang(String tablename) {
		WenZhangDao wenDao = WenZhangDaoFactory.getInstance().getDao();
		List<WenZhang> list = wenDao.findAllWenZhang(tablename);
		return list;
	}

	public WenZhang findById(int id, String tablename) {
		WenZhangDao wenDao = WenZhangDaoFactory.getInstance().getDao();
		WenZhang wenZhang = wenDao.findById(id, tablename);
		return wenZhang;
	}

	public void updateWenZhang(WenZhang wenZhang, String tablename) {
		WenZhangDao wenDao = WenZhangDaoFactory.getInstance().getDao();
		wenDao.updateWenZhang(wenZhang, tablename);
		
	}

	public List<WenZhang> findByTitle(String title, String tablename) {
		WenZhangDao wenDao = WenZhangDaoFactory.getInstance().getDao();
		List<WenZhang> list = wenDao.findByTitle(title, tablename);
		return list;
	}

	public List<WenZhang> findByPage(int currentPage, int pageSize,
			String tablename) {
		WenZhangDao wenDao = WenZhangDaoFactory.getInstance().getDao();
		List<WenZhang> list = wenDao.findByPage(currentPage, pageSize, tablename);
		return list;
	}

	public int maxPage(String tablename,int pageSize){
		WenZhangDao wenDao = WenZhangDaoFactory.getInstance().getDao();
		int records=wenDao.findRecordes(tablename);
		return records%pageSize==0?records/pageSize:records/pageSize+1;
	}
	

}
