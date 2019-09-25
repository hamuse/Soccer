package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;
public class Commander {



	public  static Command direct(HttpServletRequest request) {
		Command cd = null;
  
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE :  
			cd = new MoveCommand(request); break;
		case SEARCH :
			cd = new SearchCommand(); break;
		}
		return cd;
  }
}
