package com.sddlawyer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sddlawyer.dao.InfoDao;
import com.sddlawyer.utils.DBUtil;
import com.sddlawyer.vo.Info;

public class InfoDaoImpl implements InfoDao{

	public void addInfo(Info info) {
		List<Info> infos = this.findAllInfo();
		int id = infos.size()==0?0:infos.get(infos.size()-1).getIid();
		String sql="insert into infomation values(?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			int index=1;
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(index++, id+1);
			pstmt.setString(index++, info.getInfo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}
		
	}

	public void delInfo(int iid) {
		String sql="delete from infomation where iid=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, iid);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}
		
	}

	public List<Info> findAllInfo() {
		String sql="select * from infomaiton order by iid ASC";
		List<Info> infos=new ArrayList<Info>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					Info info = new Info();
					info.setIid(rs.getInt("iid"));
					info.setInfo(rs.getString("info"));
					infos.add(info);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return infos;
	}

	public Info findOneInfo(int id) {
		String sql = "select * from infomation where iid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				Info info = new Info();
				info.setIid(rs.getInt("iid"));
				info.setInfo(rs.getString("info"));
				return info;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close( conn, pstmt,rs);
		}
		return null;
	}

	public void updateInfo(Info info) {
		String sql="update infomation set info=? where iid=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setString(index, info.getInfo());
			pstmt.setInt(index+1, info.getIid());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}
		
	}

}
