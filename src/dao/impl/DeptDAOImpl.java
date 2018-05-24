package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comm.BaseDAO;
import dao.DeptDAO;
import entity.Dept;

public class DeptDAOImpl implements DeptDAO{
	BaseDAO bd = new BaseDAO();
	
	@Override
	public int add(Dept dept) {
		String sql = "insert into dept (deptno,dname,loc) values (?,?,?)";
		Object[] values = {dept.getDeptno(),dept.getDname(),dept.getLoc()};
		int i = bd.executeUpdate(sql, values);
		return i;
	}

	@Override
	public Dept findByDname(String dname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dept findByDeptNo(int deptNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> findAll() {
		String sql = "select * from dept";
		List<Dept> list = new ArrayList<Dept>();
		ResultSet rs = bd.executeQuery(sql, null);
		try {
			while(rs.next()){
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				list.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int del(Dept dept) {
		String sql = "delete from dept where deptno=?";
		Object[] values = {dept.getDeptno()};
		int i = bd.executeUpdate(sql, values);
		return i;
	}
	
}
