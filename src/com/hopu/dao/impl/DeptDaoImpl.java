package com.hopu.dao.impl;

import java.util.List;
import java.util.ArrayList;
import com.hopu.util.DButil;
import java.sql.*;
import com.hopu.dao.DeptDao;
import com.hopu.model.Dept;


public class DeptDaoImpl implements DeptDao{
	 private static PreparedStatement pst;
	 private static ResultSet rs;

	

	// 查询

	@Override
	public List<Dept> selectAll() {
		List<Dept> list = new ArrayList<Dept>();
		String sql = "SELECT did,dname,dremark FROM dept";
		try {
			pst = DButil.getpst(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDid(rs.getInt("did"));
				dept.setDname(rs.getString("dname"));
				dept.setDremark(rs.getString("dremark"));
				list.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(rs);
		}
		return list;
	}
	
	
}

