package com.hopu.dao;

import com.hopu.model.Emp;
import java.util.List;



public interface EmpDao{

	int insert(Emp emp);	
	

	List<Emp> selectAll();	

}

