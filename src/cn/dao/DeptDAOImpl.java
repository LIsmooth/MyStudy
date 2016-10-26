package cn.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.po.Dept;

/**
 * 部门数据访问层实现类
 * 
 * @author psh
 * 
 */
public class DeptDAOImpl extends BaseHibernateDAO implements DeptDAO {

	@Override
	public void addDept(Dept dept) throws Exception {
		Transaction tx = null;
		try {

			Session session = super.getCurrentSession();

			tx = session.beginTransaction();

			session.save(dept);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			throw new Exception(ex);
		}

	}

	@Override
	public void updateDept(Dept dept) throws Exception {
		Transaction tx = null;
		try {

			Session session = super.getCurrentSession();

			tx = session.beginTransaction();

			session.update(dept);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			throw new Exception(ex);
		}

	}

	@Override
	public void deleteDept(Dept dept) throws Exception {
		Transaction tx = null;
		try {

			Session session = super.getCurrentSession();

			tx = session.beginTransaction();

			session.delete(dept);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			throw new Exception(ex);
		}

	}

	@Override
	public Dept getDept(Serializable id) throws Exception {
		Transaction tx = null;
		Dept dept = null;
		try {

			Session session = super.getCurrentSession();

			tx = session.beginTransaction();

			dept = (Dept) session.get(Dept.class, id);

			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			throw new Exception(ex);
		}
		return dept;
	}

}
