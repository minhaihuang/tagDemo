package minhaihuang.myTag.test01.viewDemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	// 模拟使用，真实项目中不可用在Servlet中定义普通字段
	private User jianguo;
	private User dandan;

	public void init() throws ServletException {
		jianguo = new User();
		dandan = new User();

		List<Role> jianguoRoles = new ArrayList<Role>();
		jianguoRoles.add(new Role(100, "vip"));
		jianguo.setRoles(jianguoRoles);

		List<Role> dandanRoles = new ArrayList<Role>();
		dandanRoles.add(new Role(1, "common"));
		dandan.setRoles(dandanRoles);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");

		if ("jianguo".equals(username)) {
			request.getSession().setAttribute("user", jianguo);
		} else {
			request.getSession().setAttribute("user", dandan);
		}

		request.getRequestDispatcher("/MyTag/source.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
