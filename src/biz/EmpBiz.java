package biz;

import java.util.List;

import entity.Emp;

public interface EmpBiz {
	public int add(Emp emp);//��ӣ��û�ע��
	public Emp findByEname(String ename);//���ݲ������Ʋ�ѯ������Ϣ
	public Emp findByEmpno(int empNo);//���ݲ��ű�Ų�ѯ������Ϣ
	public List<Emp> findAll(); //��ѯ���в�����Ϣ
	public List<Emp> findByDeptNo(int  dempNo);//��ѯĳ�������еĹ�Ա��Ϣ
}
