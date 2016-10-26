package cn.dao;

import java.io.Serializable;

import cn.po.Dept;

/**
 * ���Žӿ�
 * 
 * @author psh
 * 
 */
public interface DeptDAO {

	/**
	 * ��Ӳ���
	 * 
	 * @return
	 */
	public void addDept(Dept dept) throws Exception;

	/**
	 * �޸Ĳ���
	 */
	public void updateDept(Dept dept) throws Exception;

	/**
	 *ɾ������
	 */
	public void deleteDept(Dept dept) throws Exception;

	/**
	 * ��ѯ����
	 */
	public Dept getDept(Serializable id) throws Exception;

}
