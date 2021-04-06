package com.hopu.service;

import com.hopu.model.Emp;
import java.util.List;



public interface EmpService{

	int insert(Emp emp);	
	

	List<Emp> selectAll();	

}

