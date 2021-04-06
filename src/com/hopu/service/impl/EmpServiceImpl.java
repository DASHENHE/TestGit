package com.hopu.service.impl;

import java.util.List;

import com.hopu.dao.EmpDao;
import com.hopu.dao.impl.EmpDaoImpl;
import com.hopu.model.Emp;
import com.hopu.service.EmpService;

public class EmpServiceImpl implements EmpService{
	private EmpDao eservice = new EmpDaoImpl();
	@Override
	public int insert(Emp emp) {
		// TODO Auto-generated method stub
		return eservice.insert(emp);
	}

	@Override
	public List<Emp> selectAll() {
		// TODO Auto-generated method stub
		return eservice.selectAll();
	}

}
