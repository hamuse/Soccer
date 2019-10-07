package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constant;
import com.soccer.web.serviseImpl.PlayerServiceImpl;

public class SearchCommand extends Command{
	public SearchCommand(HttpServletRequest request) {
		 setRequest(request);
   	  setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
//   	  setPage(request.getParameter("page"));
   	  setPage("page");
   	  request.setAttribute("page", request.getParameter("page"));
		System.out.println(request.getParameter("page"));
		System.out.println(view);
  	      execute();
	}
	public void execute() {
//		 request.setAttribute("position", PlayerServiceImpl.getInstance().frindPositions());
		request.setAttribute("position", PlayerServiceImpl.getInstance().frindPositions());
		request.setAttribute("page", request.getParameter("page"));	
		this.view = String.format(Constant.DOUBLE_PATH,"player","main");
		
//		super.execute();
	}
}
