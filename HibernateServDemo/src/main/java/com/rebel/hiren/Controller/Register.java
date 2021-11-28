package com.rebel.hiren.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rebel.hiren.Beans.User;
import com.rebel.hiren.Dao.UserDao;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("uId"));
		String name =  request.getParameter("uName");
		String Add =  request.getParameter("uAdd");
		int phone = Integer.parseInt(request.getParameter("uPhone"));
		
		User user = new User(id, name, Add, phone);
		
		UserDao udao = new UserDao();
		try {
		
		udao.saveUser(user);
		out.print("Record successfully added :)");
		
		}catch(Exception e)
		{
			System.out.println("sm prb with implementing dao from the servlet ):");
		}
		
	}

}
