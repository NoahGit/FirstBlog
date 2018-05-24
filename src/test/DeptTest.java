package test;

import java.util.List;

import dao.DeptDAO;
import dao.impl.DeptDAOImpl;
import entity.Constants;
import entity.Dept;

public class DeptTest {
	Dept dept = new Dept(Constants.deptNo, Constants.deptName, Constants.loc);
	DeptDAO dd = new DeptDAOImpl();
	public void add_dept(){
		int i = dd.add(dept);
		if(i==1){
			System.out.println("添加成功！");
		}else{
			System.out.println("添加失败，稍候再试"+i);
		}
	}
	public void del_dept(){
		int i = dd.del(dept);
		if(i>=1){
			System.out.println("删除成功！"+i+"条");
		}else{
			System.out.println("删除失败，稍候再试"+i);
		}
	}
	public void findAll_dept(){
		List<Dept> list = dd.findAll();
		for(Dept d : list) {
			System.out.println(d.getDeptno()+d.getDname()+d.getLoc());
		}
		
	}
	
	public static void main(String[] args) {
		DeptTest dt = new DeptTest();
		dt.add_dept();
		dt.del_dept();
		dt.findAll_dept();
	}
}
