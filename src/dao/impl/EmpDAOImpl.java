package dao.impl;

import java.util.List;

import comm.BaseDAO;
import dao.EmpDAO;
import entity.Emp;

public class EmpDAOImpl implements EmpDAO{
	BaseDAO bd = new BaseDAO();
	@Override
	public int add(Emp emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Emp findByEname(String ename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp findByEmpno(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findByDeptNo(int dempNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
