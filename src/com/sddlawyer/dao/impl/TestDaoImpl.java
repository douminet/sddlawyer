package com.sddlawyer.dao.impl;

import java.util.Date;
import java.util.List;

import com.sddlawyer.vo.WenZhang;

public class TestDaoImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WenZhangDaoImpl impl = new WenZhangDaoImpl();
		WenZhang wen1 = impl.findById(1,"fagui");
		List<WenZhang> list = impl.findAllWenZhang("anli");
		
		WenZhang wen2 = new WenZhang();
		wen2.setTitle("新闻1");
		wen2.setAuthor("商斗斗");
		wen2.setMain("新闻1内容");
		impl.addWenZhang(wen2, "xinwen");
		
		/*impl.delWenZhang(2, "anli");*/
		
		/*impl.updateWenZhang(wen2, "anli");*/
		
		System.out.println("****"+wen1.getTitle()+"*****"+wen1.getAuthor()+"******"+wen1.getMain()+"*******"+wen1.getDate());
		System.out.println("list+"+list.get(1).getTitle());
	}

}
