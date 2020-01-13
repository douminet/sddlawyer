package com.sddlawyer.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;



public class DBUtil {
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";  
    public static final String URL = "jdbc:mysql://localhost:3306/sddlawyer";  
    public static final String USERNAME = "root";  
    public static final String PASSWORD = "";  
  
    /** 
     * 连接数据 
     * 
     * @return conn 
     */  
    public static Connection getConnection() {  
        Connection conn = null;  
        try {  
            Class.forName(DRIVER);  
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return conn;  
    }  
  
    /** 
     * 关闭连接对象 
     * 
     * @param conn 
     *            连接对象 
     * @param pstmt 
     *            预编译对象 
     * @param rs 
     *            结果集 
     */  
    public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {  
        try {  
            if (rs != null) {  
                rs.close();  
            }  
            if (pstmt != null) {  
                pstmt.close();  
            }  
            if (conn != null) {  
                pstmt.close();  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
	
	
	/**
	 * @param args
	 * @throws SQLException 
	 * @throws Exception 
	 */
	
   

public static void main(String[] args) throws SQLException {
	DBUtil uitls = new DBUtil();
	/*dateOper.Query("INSERT INTO UserInfo (UserId,UserPwd,Age,Address,Email) VALUES " +
			"('datianer','tianer',18,'sdfsesdfsersdf','esdfe') ");*/
	Connection conn =DBUtil.getConnection();
	System.out.println(conn.isClosed());

}
    
    
}

