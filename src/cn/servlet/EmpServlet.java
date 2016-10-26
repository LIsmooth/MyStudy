package cn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dao.EmpDAO;
import cn.dao.EmpDAOImpl;
import cn.po.Emp;

@WebServlet("/empservlet")
public class EmpServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmpDAO edao = new EmpDAOImpl();

		try {
			Emp emp = edao.getEmp("20");

			request.getSession().setAttribute("emp", emp);

			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
