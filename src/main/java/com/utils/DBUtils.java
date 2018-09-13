package com.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;


/**
 * 操作数据库工具类
 *
 *
 */

@Component
public class DBUtils {
	
	
	public static Connection conn;


    /**
     * 连接数据
     *
     * @return conn
     */
	
    public static void  init(String driver,String url,String username,String password) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
  
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
    public static void closeAll(PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 增删改操作
     *
     * @param sql
     *            SQL命令
     * @param param
     *            参数
     * @return
     */
    public static int notQuery(String sql, Object[] param) {
        int result = 0;
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    pstmt.setObject(i + 1, param[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeAll(pstmt, null);
        }
        return result;
    }
    /**
     * 查询
     *
     * @return int
     * @date 2015-7-25 上午11:10:06
     */
    public static ResultSet query(String sql, String[] param) {
        PreparedStatement pstmt = null;
        ResultSet result = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    pstmt.setString(i + 1, param[i]);
                }
            }
            result = pstmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return result;
    }
}