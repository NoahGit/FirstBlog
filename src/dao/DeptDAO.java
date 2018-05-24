package dao;

import java.util.List;

import entity.Dept;

public interface DeptDAO {
	public int add(Dept dept);//��ӣ��û�ע��
	public int del(Dept dept);//ɾ���û�
	public Dept findByDname(String dname);//���ݲ������Ʋ�ѯ������Ϣ
	public Dept findByDeptNo(int deptNo);//���ݲ��ű�Ų�ѯ������Ϣ
	public List<Dept> findAll(); //��ѯ���в�����Ϣ
}
