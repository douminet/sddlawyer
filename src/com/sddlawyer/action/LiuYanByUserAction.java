package com.sddlawyer.action;

import java.util.ArrayList;
import java.util.List;

import com.sddlawyer.factory.LiuYanServiceFactory;
import com.sddlawyer.services.LiuYanService;
import com.sddlawyer.vo.LiuYan;

public class LiuYanByUserAction {
	
	LiuYanService liuYanService = LiuYanServiceFactory.getInstance().getService();
	List<LiuYan> liuYans = new ArrayList<LiuYan>();
	LiuYan liuYan = new LiuYan();
	String name;
	private int currentPage;
	private int maxPage;
	private int pageSize=16;
	private List<Integer> pages;
	
	
	
	
	
	
	
	public List<LiuYan> getLiuYans() {
		return liuYans;
	}
	public void setLiuYans(List<LiuYan> liuYans) {
		this.liuYans = liuYans;
	}
	public LiuYan getLiuYan() {
		return liuYan;
	}
	public void setLiuYan(LiuYan liuYan) {
		this.liuYan = liuYan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<Integer> getPages() {
		return pages;
	}
	public void setPages(List<Integer> pages) {
		this.pages = pages;
	}
	
	
	

}
