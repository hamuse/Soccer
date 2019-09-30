package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;
public class Commander {



	public  static Command direct(HttpServletRequest request) {
		Command cd = null;
		System.out.println("★★★ 3. Commander.direct() 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
  
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE :  
			cd = new MoveCommand(request); break;
		case SEARCH :
			cd = new SearchCommand(); break;
		case LOGIN :
			cd = new LoginCommand(request);	break;
		}
		return cd;
  }
}
