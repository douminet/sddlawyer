package com.sddlawyer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sddlawyer.dao.PersonDao;
import com.sddlawyer.utils.DBUtil;
import com.sddlawyer.vo.Person;

public class PersonDaoImpl implements PersonDao {

	public void addPerson(Person person) {
		List<Person> persons = this.findAllPerson();
		int id = persons.size()==0?0:persons.get(persons.size()-1).getId();
		String sql="insert into person values(?,?,?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			int index=1;
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(index++, id+1);
			pstmt.setString(index++, person.getPhone());
			pstmt.setString(index++, person.getEmail());
			pstmt.setString(index++, person.getQq());
			pstmt.setString(index++, person.getWangzhi());
			pstmt.setString(index++, person.getAddress());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}

	}

	public void delPerson(int id) {
		String sql="delete from person where id=?";
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

	public List<Person> findAllPerson() {
		String sql="select * from person order by id ASC";
		List<Person> persons=new ArrayList<Person>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					Person person = new Person();
					person.setId(rs.getInt("id"));
					person.setPhone(rs.getString("phone"));
					person.setEmail(rs.getString("email"));
					person.setQq(rs.getString("qq"));
					person.setWangzhi(rs.getString("wangzhi"));
					person.setAddress(rs.getString("address"));
					persons.add(person);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return persons;
	}

	public Person findOnePerson(int id) {
		String sql = "select * from person where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				Person person = new Person();
				person.setId(rs.getInt("id"));
				person.setPhone(rs.getString("phone"));
				person.setEmail(rs.getString("email"));
				person.setQq(rs.getString("qq"));
				person.setWangzhi(rs.getString("wangzhi"));
				person.setAddress(rs.getString("address"));
				return person;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close( conn, pstmt,rs);
		}
		return null;
	}

	public void updatePerson(Person person) {
		String sql="update person set phone=?,email=?,qq=?,wangzhi=?,address=? where id=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setString(index++, person.getPhone());
			pstmt.setString(index++, person.getEmail());
			pstmt.setString(index++, person.getQq());
			pstmt.setString(index++, person.getWangzhi());
			pstmt.setString(index++, person.getAddress());
			pstmt.setInt(index++, person.getId());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}

	}

}
