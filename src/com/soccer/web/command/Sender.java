package com.soccer.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class Sender {
      public static void forward(HttpServletRequest request , HttpServletResponse response) {
    	  try {
    		  
    		  System.out.println("도착지 ::"+ Receiver.cmd.getView());
    		 String page = request.getParameter("page");
    		 
			request.getRequestDispatcher(Receiver.cmd.getView()).forward(request,response); // 보내야하는것 .

		} catch (Exception e) {
			e.printStackTrace();
		}
      }
      
      
      public static void redirect(HttpServletRequest request , HttpServletResponse response) {
    	  try {
			response.sendRedirect("");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
      }
}
