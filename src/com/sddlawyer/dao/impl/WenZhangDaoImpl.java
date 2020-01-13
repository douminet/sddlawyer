package com.sddlawyer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sddlawyer.dao.WenZhangDao;
import com.sddlawyer.utils.DBUtil;
import com.sddlawyer.vo.WenZhang;
import com.sddlawyer.vo.ZiDuan;

public class WenZhangDaoImpl extends WenZhang implements WenZhangDao {

	private String id;
	private String title;
	private String author;
	private String date;
	private String main;
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	
	public WenZhang findById(int id,String tablename) {
		ZiDuan zd = this.makeCname(tablename);
		String sql = "select * from "+tablename+" where "+zd.getId()+"=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				WenZhang wenZhang = new WenZhang();
				wenZhang.setId(rs.getInt(zd.getId()));
				wenZhang.setAuthor(rs.getString(zd.getAuthor()));
				wenZhang.setDate(rs.getString(zd.getDate()));
				wenZhang.setMain(rs.getString(zd.getMain()));
				wenZhang.setTitle(rs.getString(zd.getTitle()));
				return wenZhang;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close( conn, pstmt,rs);
		}
		return null;
	}

	public void addWenZhang(WenZhang wenZhang, String tablename) {
		ZiDuan zd = this.makeCname(tablename);
		List<WenZhang> wens = this.findAllWenZhang(tablename);
		int id =wens.size()==0?0: wens.get(wens.size()-1).getId();
		String sql="insert into "+tablename+" values(?,?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			int index=1;
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(index++, id+1);
			pstmt.setString(index++, wenZhang.getTitle());
			pstmt.setString(index++, wenZhang.getAuthor());
			pstmt.setString(index++, sdf.format(new Date()));
			pstmt.setString(index++, wenZhang.getMain());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}
		
	}

	public void delWenZhang(int id, String tablename) {
		ZiDuan zd = this.makeCname(tablename);
		String sql="delete from "+tablename+" where "+zd.getId()+"=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}
		
	}

	public List<WenZhang> findAllWenZhang(String tablename) {
		ZiDuan zd = this.makeCname(tablename);
		String sql="select * from "+tablename+" order by "+zd.getId()+" ASC";
		List<WenZhang> wens=new ArrayList<WenZhang>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					WenZhang wenZhang = new WenZhang();
					wenZhang.setId(rs.getInt(zd.getId()));
					wenZhang.setTitle(rs.getString(zd.getTitle()));
					wenZhang.setAuthor(rs.getString(zd.getAuthor()));
					wenZhang.setDate(rs.getString(zd.getDate()));
					wenZhang.setMain(rs.getString(zd.getMain()));
					wens.add(wenZhang);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return wens;
	}


	public List<WenZhang> findByTitle(String title, String tablename) {
		ZiDuan zd = this.makeCname(tablename);
		List<WenZhang> wens=new ArrayList<WenZhang>();
		String sql = "select * from "+tablename+" where "+zd.getTitle()+" LIKE '%?%'";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		WenZhang wenzhang = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,title);
			rs = pstmt.executeQuery();
			while(rs.next()){
				WenZhang wenZhang = new WenZhang();
				wenZhang.setId(rs.getInt(zd.getId()));
				wenZhang.setTitle(rs.getString(zd.getTitle()));
				wenZhang.setAuthor(rs.getString(zd.getAuthor()));
				wenZhang.setDate(rs.getString(zd.getDate()));
				wenZhang.setMain(rs.getString(zd.getMain()));
				wens.add(wenZhang);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return wens;
	}

	public void updateWenZhang(WenZhang wenZhang, String tablename) {
		ZiDuan zd = this.makeCname(tablename);
		String sql="update "+tablename+" set "+zd.getTitle()+"=?,"+zd.getAuthor()+"=?,"+zd.getDate()+"=?,"+zd.getMain()+"=? where "+zd.getId()+"=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setString(index++, wenZhang.getTitle());
			pstmt.setString(index++, wenZhang.getAuthor());
			pstmt.setString(index++, wenZhang.getDate());
			pstmt.setString(index++, wenZhang.getMain());
			pstmt.setInt(index++, wenZhang.getId());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}
		
	}

	public ZiDuan makeCname(String tablename) {
		ZiDuan ziDuan = new ZiDuan();
		if(tablename.equals("anli")){
			this.id = "aid";
			this.title = "a_title";
			this.author = "a_author";
			this.date = "a_date";
			this.main = "a_main";
		}else if(tablename.equals("fagui")){
			this.id = "fid";
			this.title = "f_title";
			this.author = "f_author";
			this.date = "f_date";
			this.main = "f_main";
		}else if(tablename.equals("susong")){
			this.id = "sid";
			this.title = "s_title";
			this.author = "s_author";
			this.date = "s_date";
			this.main = "s_main";
		}else if(tablename.equals("xinwen")){
			this.id = "xid";
			this.title = "x_title";
			this.author = "x_author";
			this.date = "x_date";
			this.main = "x_main";
		}else if(tablename.equals("zhongcai")){
			this.id = "zid";
			this.title = "z_title";
			this.author = "z_author";
			this.date = "z_date";
			this.main = "z_main";
		}
		ziDuan.setId(id);
		ziDuan.setTitle(title);
		ziDuan.setAuthor(author);
		ziDuan.setDate(date);
		ziDuan.setMain(main);
		return ziDuan;
	}

	public List<WenZhang> findByPage(int currentPage, int pageSize,
			String tablename) {
		ZiDuan zd = this.makeCname(tablename);
		String sql = "select * from "+tablename+" order by "+zd.getDate()+" DESC,"+zd.getId()+" DESC limit ?,?";
		List<WenZhang> wens = new ArrayList<WenZhang>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (currentPage-1)*pageSize);
			pstmt.setInt(2, pageSize);
			rs = pstmt.executeQuery();
			while(rs.next()){
				WenZhang wenZhang = new WenZhang();
				wenZhang.setId(rs.getInt(zd.getId()));
				wenZhang.setTitle(rs.getString(zd.getTitle()));
				wenZhang.setAuthor(rs.getString(zd.getAuthor()));
				wenZhang.setDate(rs.getString(zd.getDate()));
				wenZhang.setMain(rs.getString(zd.getMain()));
				wens.add(wenZhang);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return wens;
	}

	public int findRecordes(String tablename){
		String sql="select count(*) from "+tablename;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				return rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return 0;
	}
	
	

}
