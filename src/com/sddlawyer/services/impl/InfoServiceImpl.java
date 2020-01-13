package com.sddlawyer.services.impl;

import java.util.List;

import com.sddlawyer.dao.InfoDao;
import com.sddlawyer.factory.InfoDaoFactory;
import com.sddlawyer.services.InfoService;
import com.sddlawyer.vo.Info;

public class InfoServiceImpl implements InfoService {

	public void addInfo(Info info) {
		InfoDao infoDao = InfoDaoFactory.getInstance().getDao();
		infoDao.addInfo(info);

	}

	public void delInfo(int iid) {
		InfoDao infoDao = InfoDaoFactory.getInstance().getDao();
		infoDao.delInfo(iid);

	}

	public List<Info> findAllInfo() {
		InfoDao infoDao = InfoDaoFactory.getInstance().getDao();
		List<Info> list = infoDao.findAllInfo();
		return list;
	}

	public Info findOneInfo(int id) {
		InfoDao infoDao = InfoDaoFactory.getInstance().getDao();
		Info info = infoDao.findOneInfo(id);
		return info;
	}

	public void updateInfo(Info info) {
		InfoDao infoDao = InfoDaoFactory.getInstance().getDao();
		infoDao.updateInfo(info);

	}

}
