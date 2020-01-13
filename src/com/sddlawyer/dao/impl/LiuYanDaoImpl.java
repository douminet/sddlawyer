package com.sddlawyer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sddlawyer.dao.LiuYanDao;
import com.sddlawyer.utils.DBUtil;
import com.sddlawyer.vo.LiuYan;
import com.sddlawyer.vo.WenZhang;

public class LiuYanDaoImpl implements LiuYanDao {

	public void addLiuYan(LiuYan liuYan) {
		
		String sql="insert into liuyan values(?,?,?,?,?,?,?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			int index=1;
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(index++, liuYan.getLid());
			pstmt.setString(index++, liuYan.getL_name());
			pstmt.setString(index++, liuYan.getL_sex());
			pstmt.setString(index++, liuYan.getL_title());
			pstmt.setString(index++, liuYan.getL_main());
			pstmt.setString(index++, liuYan.getL_email());
			pstmt.setString(index++, liuYan.getL_address());
			pstmt.setString(index++, liuYan.getL_phone());
			pstmt.setString(index++, liuYan.getL_fangshi());
			pstmt.setString(index++, liuYan.getL_date());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}

	}

	public void delLiuYan(int lid) {
		String sql="delete from liuyan where lid=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, lid);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}

	}

	public List<LiuYan> findAllLiuYan() {
		String sql="select * from liuyan order by lid ASC";
		List<LiuYan> liuYans=new ArrayList<LiuYan>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					LiuYan liuYan = new LiuYan();
					liuYan.setLid(rs.getInt("lid"));
					liuYan.setL_title(rs.getString("l_title"));
					liuYan.setL_sex(rs.getString("l_sex"));
					liuYan.setL_phone(rs.getString("l_phone"));
					liuYan.setL_name(rs.getString("l_name"));
					liuYan.setL_main(rs.getString("l_main"));
					liuYan.setL_fangshi(rs.getString("l_fangshi"));
					liuYan.setL_email(rs.getString("l_email"));
					liuYan.setL_date(rs.getString("l_date"));
					liuYan.setL_address(rs.getString("l_address"));
					liuYans.add(liuYan);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return liuYans;
	}

	public LiuYan findById(int lid) {
		String sql = "select * from liuyan where lid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, lid);
			rs = pstmt.executeQuery();
			if(rs.next()){
				LiuYan liuYan = new LiuYan();
				liuYan.setLid(rs.getInt("lid"));
				liuYan.setL_title(rs.getString("l_title"));
				liuYan.setL_sex(rs.getString("l_sex"));
				liuYan.setL_phone(rs.getString("l_phone"));
				liuYan.setL_name(rs.getString("l_name"));
				liuYan.setL_main(rs.getString("l_main"));
				liuYan.setL_fangshi(rs.getString("l_fangshi"));
				liuYan.setL_email(rs.getString("l_email"));
				liuYan.setL_date(rs.getString("l_date"));
				liuYan.setL_address(rs.getString("l_address"));
				return liuYan;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close( conn, pstmt,rs);
		}
		return null;
	}

	public List<LiuYan> findByTitle(String l_Title) {
		String sql="select * from liuyan where l_title="+l_Title+" order by l_date ASC";
		List<LiuYan> liuYans=new ArrayList<LiuYan>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					LiuYan liuYan = new LiuYan();
					liuYan.setLid(rs.getInt("lid"));
					liuYan.setL_title(rs.getString("l_title"));
					liuYan.setL_sex(rs.getString("l_sex"));
					liuYan.setL_phone(rs.getString("l_phone"));
					liuYan.setL_name(rs.getString("l_name"));
					liuYan.setL_main(rs.getString("l_main"));
					liuYan.setL_fangshi(rs.getString("l_fangshi"));
					liuYan.setL_email(rs.getString("l_email"));
					liuYan.setL_date(rs.getString("l_date"));
					liuYan.setL_address(rs.getString("l_address"));
					liuYans.add(liuYan);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return liuYans;
	}

	public void updateLiuYan(LiuYan liuYan) {
		// TODO Auto-generated method stub

	}

	public List<LiuYan> findByPage(int currentPage, int pageSize) {
		String sql = "select * from liuyan order by l_date DESC,lid DESC limit ?,?";
		List<LiuYan> liuYans=new ArrayList<LiuYan>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (currentPage-1)*pageSize);
			pstmt.setInt(2, pageSize);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					LiuYan liuYan = new LiuYan();
					liuYan.setLid(rs.getInt("lid"));
					liuYan.setL_title(rs.getString("l_title"));
					liuYan.setL_sex(rs.getString("l_sex"));
					liuYan.setL_phone(rs.getString("l_phone"));
					liuYan.setL_name(rs.getString("l_name"));
					liuYan.setL_main(rs.getString("l_main"));
					liuYan.setL_fangshi(rs.getString("l_fangshi"));
					liuYan.setL_email(rs.getString("l_email"));
					liuYan.setL_date(rs.getString("l_date"));
					liuYan.setL_address(rs.getString("l_address"));
					liuYans.add(liuYan);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return liuYans;
	}

	public int findRecordes() {
		String sql="select count(*) from liuyan";
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

	public List<LiuYan> findByLikeTitle(String l_Title) {
		String sql="select * from liuyan where l_title LIKE %"+l_Title+"% order by l_date ASC";
		List<LiuYan> liuYans=new ArrayList<LiuYan>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					LiuYan liuYan = new LiuYan();
					liuYan.setLid(rs.getInt("lid"));
					liuYan.setL_title(rs.getString("l_title"));
					liuYan.setL_sex(rs.getString("l_sex"));
					liuYan.setL_phone(rs.getString("l_phone"));
					liuYan.setL_name(rs.getString("l_name"));
					liuYan.setL_main(rs.getString("l_main"));
					liuYan.setL_fangshi(rs.getString("l_fangshi"));
					liuYan.setL_email(rs.getString("l_email"));
					liuYan.setL_date(rs.getString("l_date"));
					liuYan.setL_address(rs.getString("l_address"));
					liuYans.add(liuYan);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return liuYans;
	}

}
