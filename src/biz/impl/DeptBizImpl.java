package biz.impl;

import java.util.List;

import biz.DeptBiz;
import dao.DeptDAO;
import dao.impl.DeptDAOImpl;
import entity.Dept;

public class DeptBizImpl implements DeptBiz {
	DeptDAO dd = new DeptDAOImpl();
	
	@Override
	public int add(Dept dept) {
		// TODO Auto-generated method stub
		return dd.add(dept);
	}

	@Override
	public int del(Dept dept) {
		// TODO Auto-generated method stub
		return dd.del(dept);
	}

	@Override
	public Dept findByDname(String dname) {
		// TODO Auto-generated method stub
		return dd.findByDname(dname);
	}

	@Override
	public Dept findByDeptNo(int deptNo) {
		// TODO Auto-generated method stub
		return dd.findByDeptNo(deptNo);
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return dd.findAll();
	}
	
}
