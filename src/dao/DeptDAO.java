package dao;

import java.util.List;

import entity.Dept;

public interface DeptDAO {
	public int add(Dept dept);//添加，用户注册
	public int del(Dept dept);//删除用户
	public Dept findByDname(String dname);//根据部门名称查询部门信息
	public Dept findByDeptNo(int deptNo);//根据部门编号查询部门信息
	public List<Dept> findAll(); //查询所有部门信息
}
