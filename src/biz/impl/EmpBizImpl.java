package biz.impl;

import java.util.List;

import biz.EmpBiz;
import dao.EmpDAO;
import dao.impl.EmpDAOImpl;
import entity.Emp;

public class EmpBizImpl implements EmpBiz {
	EmpDAO ed = new EmpDAOImpl();
	@Override
	public int add(Emp emp) {
		return ed.add(emp);
	}

	@Override
	public Emp findByEname(String ename) {
		return ed.findByEname(ename);
	}

	@Override
	public Emp findByEmpno(int empNo) {
		return ed.findByEmpno(empNo);
	}

	@Override
	public List<Emp> findAll() {
		return ed.findAll();
	}

	@Override
	public List<Emp> findByDeptNo(int dempNo) {
		return ed.findByDeptNo(dempNo);
	}
	
}
