package cn.dao;

import java.io.Serializable;

import cn.po.Emp;

/**
 * 员工接口
 * 
 * @author psh
 * 
 */
public interface EmpDAO {

	/**
	 * 添加员工
	 * 
	 * @return
	 */
	public void addEmp(Emp emp) throws Exception;

	/**
	 * 修改员工
	 */
	public void updateEmp(Emp emp) throws Exception;

	/**
	 * 修改员工
	 */
	public void deleteEmp(Emp emp) throws Exception;

	/**
	 * 查询员工
	 */
	public Emp getEmp(Serializable id) throws Exception;

}
