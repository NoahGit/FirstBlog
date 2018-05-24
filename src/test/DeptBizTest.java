package test;

import java.util.List;

import biz.DeptBiz;
import biz.impl.DeptBizImpl;
import entity.Constants;
import entity.Dept;

public class DeptBizTest {
	Dept dept = new Dept(Constants.deptNo, Constants.deptName, Constants.loc);
	DeptBiz db = new DeptBizImpl();
	public void add_deptBiz(){
		int i = db.add(dept);
		if(i==1){
			System.out.println("��ӳɹ���");
		}else{
			System.out.println("���ʧ�ܣ��Ժ�����"+i);
		}
	}
	public void del_deptBiz(){
		int i = db.del(dept);
		if(i>=1){
			System.out.println("ɾ���ɹ���"+i+"��");
		}else{
			System.out.println("ɾ��ʧ�ܣ��Ժ�����"+i);
		}
	}
	public void findAll_deptBiz(){
		List<Dept> list = db.findAll();
		for(Dept d : list){
			System.out.println(d.getDeptno()+d.getDname()+d.getLoc());
		}
	}
	public static void main(String[] args) {
		DeptBizTest dbt = new DeptBizTest();
		dbt.add_deptBiz();
		dbt.del_deptBiz();
		dbt.findAll_deptBiz();
	}
	
}
