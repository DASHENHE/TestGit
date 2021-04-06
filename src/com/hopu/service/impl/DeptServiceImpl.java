package com.hopu.service.impl;

import java.util.List;

import com.hopu.dao.DeptDao;
import com.hopu.dao.impl.DeptDaoImpl;
import com.hopu.model.Dept;
import com.hopu.service.DeptService;

public class DeptServiceImpl implements DeptService{
	private DeptDao service = new DeptDaoImpl();
	@Override
	public List<Dept> selectAll() {
		// TODO Auto-generated method stub
		return service.selectAll();
	}

}
