package cn.dao;

import java.io.Serializable;

import cn.po.Dept;

/**
 * 部门接口
 * 
 * @author psh
 * 
 */
public interface DeptDAO {

	/**
	 * 添加部门
	 * 
	 * @return
	 */
	public void addDept(Dept dept) throws Exception;

	/**
	 * 修改部门
	 */
	public void updateDept(Dept dept) throws Exception;

	/**
	 *删除部门
	 */
	public void deleteDept(Dept dept) throws Exception;

	/**
	 * 查询部门
	 */
	public Dept getDept(Serializable id) throws Exception;

}
