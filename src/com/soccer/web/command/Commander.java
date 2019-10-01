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
//  	CREATE, SEARCH,UPDATE, DELETE, 		MOVE, LOGIN
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE :  cd = new CreateCommand(request);
			 break;
		case SEARCH :
			break;
		case UPDATE :
			break;
		case DELETE :
			break;
		case MOVE :  cd = new MoveCommand(request);
		break;
		case LOGIN :
				break;
		}
		return cd;
  }
}
