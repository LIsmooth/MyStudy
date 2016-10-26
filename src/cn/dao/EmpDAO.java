package cn.dao;

import java.io.Serializable;

import cn.po.Emp;

/**
 * Ա���ӿ�
 * 
 * @author psh
 * 
 */
public interface EmpDAO {

	/**
	 * ���Ա��
	 * 
	 * @return
	 */
	public void addEmp(Emp emp) throws Exception;

	/**
	 * �޸�Ա��
	 */
	public void updateEmp(Emp emp) throws Exception;

	/**
	 * �޸�Ա��
	 */
	public void deleteEmp(Emp emp) throws Exception;

	/**
	 * ��ѯԱ��
	 */
	public Emp getEmp(Serializable id) throws Exception;

}
