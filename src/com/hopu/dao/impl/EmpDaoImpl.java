package com.hopu.dao.impl;

import java.util.List;
import java.util.ArrayList;
import com.hopu.util.DButil;
import java.sql.*;
import com.hopu.dao.EmpDao;
import com.hopu.model.Emp;


public class EmpDaoImpl implements EmpDao{
	 private static PreparedStatement pst;
	 private static ResultSet rs;

	// 增加
	@Override
	public int insert(Emp emp) {
		String sql = "INSERT INTO emp (eid,ename,esex,eage,ebirthday,ephone,eaddress,did)VALUES (?,?,?,?,?,?,?,?)";
		int i =0;
		try {
			pst = DButil.getpst(sql);
			pst.setInt(1, emp.getEid());
			pst.setString(2, emp.getEname());
			pst.setString(3, emp.getEsex());
			pst.setInt(4, emp.getEage());
			pst.setString(5, emp.getEbirthday());
			pst.setInt(6, emp.getEphone());
			pst.setString(7, emp.getEaddress());
			pst.setInt(8, emp.getDid());
			i = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(null);
		}
		return i;
	}
	


	// 查询

	@Override
	public List<Emp> selectAll() {
		List<Emp> list = new ArrayList<Emp>();
		String sql = "SELECT eid,ename,esex,eage,ebirthday,ephone,eaddress,did FROM emp";
		try {
			pst = DButil.getpst(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEid(rs.getInt("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setEsex(rs.getString("esex"));
				emp.setEage(rs.getInt("eage"));
				emp.setEbirthday(rs.getString("ebirthday"));
				emp.setEphone(rs.getInt("ephone"));
				emp.setEaddress(rs.getString("eaddress"));
				emp.setDid(rs.getInt("did"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(rs);
		}
		return list;
	}
	
	
}

