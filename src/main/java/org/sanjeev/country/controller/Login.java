package org.sanjeev.country.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// setting the content type
		response.setContentType("text/html");
		HttpSession session = request.getSession(true);
		PrintWriter pr = response.getWriter();
		try {
			RequestDispatcher requestDispatcher;

			String loginName = request.getParameter("userName");
			String password = request.getParameter("password");

			/*DriverServicesImpl driverServicesImpl = new DriverServicesImpl();
			Driver driver = driverServicesImpl.authenticateDriver(loginName, password);
*/
			session.setAttribute("loginName", loginName);

			if (password != null) {
				if (password.equals("admin123")) {
					System.out.println("Admin");
					requestDispatcher = request.getRequestDispatcher("admin_home.jsp");
					requestDispatcher.forward(request, response);
				} else {
					System.out.println("Login Failed");
					request.setAttribute("error", "Invalid Credentials");
					RequestDispatcher rd = request.getRequestDispatcher("login/login_failure.jsp");
					rd.forward(request, response);
				}
			}
			pr.close();
		} catch (Exception e) {
			System.out.println("Exception");
			request.setAttribute("error", "Invalid Credentials");
			RequestDispatcher rd = request.getRequestDispatcher("login/login_failure.jsp");
			rd.forward(request, response);
			pr.close();
		}

	}
}
