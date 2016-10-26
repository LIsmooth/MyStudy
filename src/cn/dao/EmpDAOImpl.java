package cn.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.po.Emp;

public class EmpDAOImpl extends BaseHibernateDAO implements EmpDAO {

	public static void main(String[] args) throws Exception {

		EmpDAOImpl ed = new EmpDAOImpl();

		Emp emp = (Emp) ed.getEmp("20");// 调用方法查询员工编号为20

		System.out.println(emp.getEmpname());
		System.out.println(emp.getDept().getDeptname());
	}

	@Override
	public void addEmp(Emp emp) throws Exception {
		Transaction tx = null;
		try {

			Session session = super.getCurrentSession();

			tx = session.beginTransaction();

			session.save(emp);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			throw new Exception(ex);
		}

	}

	@Override
	public void updateEmp(Emp emp) throws Exception {
		Transaction tx = null;
		try {

			Session session = super.getCurrentSession();

			tx = session.beginTransaction();

			session.update(emp);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			throw new Exception(ex);
		}

	}

	@Override
	public void deleteEmp(Emp emp) throws Exception {
		Transaction tx = null;
		try {

			Session session = super.getCurrentSession();

			tx = session.beginTransaction();

			session.delete(emp);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			throw new Exception(ex);
		}

	}

	@Override
	public Emp getEmp(Serializable id) throws Exception {
		Transaction tx = null;
		Emp emp = null;
		try {

			Session session = super.getCurrentSession();

			emp = (Emp) session.get(Emp.class, id);

		} catch (Exception ex) {

			ex.printStackTrace();
			throw new Exception(ex);
		}
		return emp;
	}

}
