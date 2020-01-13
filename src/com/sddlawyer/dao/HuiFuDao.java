package com.sddlawyer.dao;

import java.util.List;

import com.sddlawyer.vo.HuiFu;

public interface HuiFuDao {
	
	public void addHuiFu(HuiFu huiFu);
	public List<HuiFu> findAllHuiFu();
	public void delHuiFu(int hid);
	public void delHuiFuByLid(int lid);
	public HuiFu findById(HuiFu huiFu);
	public void updHuiFu(HuiFu huiFu);
	public List<HuiFu> findByLid(int lid);

}
