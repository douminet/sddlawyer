package com.sddlawyer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.sddlawyer.dao.MoneyDao;
import com.sddlawyer.utils.DBUtil;
import com.sddlawyer.vo.Money;

public class MoneyDaoImpl implements MoneyDao {

	public void addMoney(Money money) {
		// TODO Auto-generated method stub
		String sql="insert into money values(?,?,?,?,?,?)";
		UUID uuid = UUID.randomUUID();
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			int index=1;
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(index++, uuid.toString());
			pstmt.setString(index++, money.getType());
			pstmt.setString(index++, money.getDate());
			pstmt.setDouble(index++, money.getAmount());
			pstmt.setString(index++, money.getUse());
			pstmt.setString(index++, money.getName());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}

	}

	public List<Money> findAllMoney() {
		String sql="select * from money order by date ASC";
		List<Money> moneys=new ArrayList<Money>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					Money money = new Money();
					money.setUuid(rs.getString("uuid"));
					String type;
					if(rs.getString("type").equals("chu")){
						type="支出";
					}else{
						type="收入";
					}
					money.setType(type);
					money.setDate(rs.getString("date"));
					money.setAmount(rs.getDouble("amount"));
					money.setUse(rs.getString("howuse"));
					String name;
					if(rs.getString("name").equals("sdd")){
						name="我斗";
					}else{
						name="胖墩儿";
					}
					money.setName(name);
					moneys.add(money);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return moneys;

	}

	public void delMoney(String uuid) {
		// TODO Auto-generated method stub

	}

	public void delMoneyByUuid(String uuid) {
		// TODO Auto-generated method stub

	}

	public Money findByUUid(Money money) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updMoney(Money money) {
		String sql="update money set type='"+money.getType()+"',date='"+money.getDate()+"',amount='"+money.getAmount()+"',howuse='"+money.getUse()+"',name='"+money.getName()+"' where uuid='"+money.getUuid()+"'";
		System.out.println("sql:"+sql);
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DBUtil.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null);
		}

	}

	public Money findByUuid(String uuid) {
		String sql="select * from money where uuid='"+uuid+"'";
		List<Money> moneys=new ArrayList<Money>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					Money money = new Money();
					money.setUuid(rs.getString("uuid"));
					String type;
					if(rs.getString("type").equals("chu")){
						type="支出";
					}else{
						type="收入";
					}
					money.setType(type);
					money.setDate(rs.getString("date"));
					money.setAmount(rs.getDouble("amount"));
					money.setUse(rs.getString("howuse"));
					String name;
					if(rs.getString("name").equals("sdd")){
						name="我斗";
					}else{
						name="胖墩儿";
					}
					money.setName(name);
					moneys.add(money);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return moneys.get(0);
	}

	public double findSumByChu() {
		String sql="SELECT sum(amount) sum from money where type = 'chu'";
		double sum = 0;
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					sum = rs.getDouble("sum");
					System.out.println("dao.sum:"+sum);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return sum;
	}

	public double findSumByRu() {
		String sql="SELECT sum(amount) sum from money where type = 'ru'";
		double sum = 0;
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					sum = rs.getDouble("sum");
					System.out.println("dao.sum1:"+sum);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return sum;
	}

	public List<Money> findAllMoneyByDate(String date) {
		String sql="select * from money where date like '%"+date+"%' order by date ASC";
		List<Money> moneys=new ArrayList<Money>();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					Money money = new Money();
					money.setUuid(rs.getString("uuid"));
					String type;
					if(rs.getString("type").equals("chu")){
						type="支出";
					}else{
						type="收入";
					}
					money.setType(type);
					money.setDate(rs.getString("date"));
					money.setAmount(rs.getDouble("amount"));
					money.setUse(rs.getString("howuse"));
					String name;
					if(rs.getString("name").equals("sdd")){
						name="我斗";
					}else{
						name="胖墩儿";
					}
					money.setName(name);
					moneys.add(money);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return moneys;
	}

	public double findSumByChuByDate(String date) {
		String sql="SELECT sum(amount) sum from money where type = 'chu' and date like '%"+date+"%'";
		double sum = 0;
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					sum = rs.getDouble("sum");
					System.out.println("dao.sum:"+sum);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return sum;
	}

	public double findSumByRuByDate(String date) {
		String sql="SELECT sum(amount) sum from money where type = 'ru' and date like '%"+date+"%'";
		double sum = 0;
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()){
					sum = rs.getDouble("sum");
					System.out.println("dao.sum1:"+sum);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return sum;
	}

}
