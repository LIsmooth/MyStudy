package cn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.dao.BaseHibernateDAO;

public class OpenSessionInViewFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain fc) throws IOException, ServletException {

		System.out.println("Ω¯»Îfilter¡À....");

		Session session = BaseHibernateDAO.getCurrentSession();

		Transaction tx = session.beginTransaction();
		try {
			fc.doFilter(req, resp);

			tx.commit();

		} catch (Exception ex) {

			ex.printStackTrace();
			tx.rollback();

		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
