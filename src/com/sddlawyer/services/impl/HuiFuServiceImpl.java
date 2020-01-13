package com.sddlawyer.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.sddlawyer.dao.HuiFuDao;
import com.sddlawyer.factory.HuiFuFactory;
import com.sddlawyer.services.HuiFuService;
import com.sddlawyer.vo.HuiFu;

public class HuiFuServiceImpl implements HuiFuService {
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public void addHuiFu(HuiFu huiFu) {
		HuiFuDao dao = HuiFuFactory.getInstance().getDao();
		huiFu.setH_date(sdf.format(new Date()));
		dao.addHuiFu(huiFu);

	}

	public void delHuiFu(int hid) {
		HuiFuDao dao = HuiFuFactory.getInstance().getDao();
		dao.delHuiFu(hid);

	}
	
	public void delHuiFuByLid(int lid) {
		HuiFuDao dao = HuiFuFactory.getInstance().getDao();
		dao.delHuiFuByLid(lid);
		
	}

	public List<HuiFu> findAllHuiFu() {
		HuiFuDao dao = HuiFuFactory.getInstance().getDao();
		List<HuiFu> list = dao.findAllHuiFu();
		return list;
	}

	public HuiFu findById(HuiFu huiFu) {
		HuiFuDao dao = HuiFuFactory.getInstance().getDao();
		HuiFu huiFu1 = dao.findById(huiFu);
		return huiFu1;
	}

	public List<HuiFu> findByLid(int lid) {
		HuiFuDao dao = HuiFuFactory.getInstance().getDao();
		List<HuiFu> list = dao.findByLid(lid);
		return list;
	}

	public void updHuiFu(HuiFu huiFu) {
		HuiFuDao dao = HuiFuFactory.getInstance().getDao();
		dao.updHuiFu(huiFu);

	}

	

}
