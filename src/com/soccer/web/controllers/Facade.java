package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.soccer.web.pool.Constant;


@WebServlet("/facade.do")
public class Facade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	enum Resources{  //이넘을 만듬
		 CTX, CSS, JS, IMG
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("퍼사드로 들어옴");
         
		
		for(Resources r : Resources.values()) {
			System.out.println(">>>>>"+r.toString().toLowerCase());
//			    request.getSession().setAttribute(r.toString().toLowerCase(), request.getContextPath()+"/resources/"+r.toString().toLowerCase()); 
			    request.getSession().setAttribute(r.toString().toLowerCase(), request.getContextPath()+((r.toString().toLowerCase().equals("ctx"))
			    		?"" : "/resources/"+r.toString().toLowerCase()));
		}
//       RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/facade/login.jsp");
//       rd.forward(request, response);
		
	  request
	  .getRequestDispatcher(
			  String.format(Constant.DOUBLE_PATH,request.getServletPath().substring(1,request.getServletPath().indexOf(".")),
					  "login"))
	  .forward(request, response);

	  
	}



}
