package cn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseHibernateDAO {

	static SessionFactory sf = null;

	static {
		Configuration cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}

	public static Session getCurrentSession() {
		return sf.getCurrentSession();
	}

}
