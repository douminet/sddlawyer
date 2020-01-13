package com.sddlawyer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sddlawyer.dao.HuiFuDao;
import com.sddlawyer.utils.DBUtil;
import com.sddlawyer.vo.HuiFu;
import com.sddlawyer.vo.LiuYan;

public class HuiFuDaoImpl implements HuiFuDao {

	public void addHuiFu(HuiFu huiFu) {
		String sql="insert into huifu values(?,?,?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			int index=1;
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(index++, huiFu.getHid());
			pstmt.setInt(index++, huiFu.getLid());
			pstmt.setString(index++, huiFu.getH_main());
			pstmt.setString(index++, huiFu.getH_name());
			pstmt.setString(index++, huiFu.getH_date());
			pstmt.setInt(index++, huiFu.getIsyk());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}

	}

	public void delHuiFu(int hid) {
		String sql="delete from huifu where hid=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, hid);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}


	}
	
	public void delHuiFuByLid(int lid) {
		String sql="delete from huifu where lid=?";
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

	public List<HuiFu> findAllHuiFu() {
		String sql="select * from huifu order by hid ASC";
		List<HuiFu> huiFus=new ArrayList<HuiFu>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					HuiFu huiFu = new HuiFu();
					huiFu.setHid(rs.getInt("hid"));
					huiFu.setLid(rs.getInt("lid"));
					huiFu.setH_main(rs.getString("h_main"));
					huiFu.setH_name(rs.getString("h_name"));
					huiFu.setH_date(rs.getString("h_date"));
					huiFu.setIsyk(rs.getInt("isyk"));
					huiFus.add(huiFu);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return huiFus;
	}

	public HuiFu findById(HuiFu huiFu) {
		String sql = "select * from huifu where hid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, huiFu.getHid());
			rs = pstmt.executeQuery();
			if(rs.next()){
				HuiFu huiFu1 = new HuiFu();
				huiFu1.setHid(rs.getInt("hid"));
				huiFu1.setLid(rs.getInt("lid"));
				huiFu1.setH_main(rs.getString("h_main"));
				huiFu1.setH_name(rs.getString("h_name"));
				huiFu1.setH_date(rs.getString("h_date"));
				huiFu1.setIsyk(rs.getInt("isyk"));
				return huiFu1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close( conn, pstmt,rs);
		}
		return null;
	}

	public List<HuiFu> findByLid(int lid) {
		String sql="select * from huifu where lid="+lid+" order by h_date ASC,hid ASC";
		List<HuiFu> huiFus=new ArrayList<HuiFu>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					HuiFu huiFu1 = new HuiFu();
					huiFu1.setHid(rs.getInt("hid"));
					huiFu1.setLid(rs.getInt("lid"));
					huiFu1.setH_main(rs.getString("h_main"));
					huiFu1.setH_name(rs.getString("h_name"));
					huiFu1.setH_date(rs.getString("h_date"));
					huiFu1.setIsyk(rs.getInt("isyk"));
					huiFus.add(huiFu1);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return huiFus;
	}

	public void updHuiFu(HuiFu huiFu) {
		String sql="update huifu set h_main=? where hid=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setString(index++, huiFu.getH_main());
			pstmt.setInt(index++, huiFu.getHid());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}

	}

	

}
