package biz;

import java.util.List;

import entity.Emp;

public interface EmpBiz {
	public int add(Emp emp);//添加，用户注册
	public Emp findByEname(String ename);//根据部门名称查询部门信息
	public Emp findByEmpno(int empNo);//根据部门编号查询部门信息
	public List<Emp> findAll(); //查询所有部门信息
	public List<Emp> findByDeptNo(int  dempNo);//查询某个部门中的雇员信息
}
