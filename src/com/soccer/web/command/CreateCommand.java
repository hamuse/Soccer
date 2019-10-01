package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviseImpl.PlayerServiceImpl;

public class CreateCommand extends Command{
	public CreateCommand(HttpServletRequest request) {
		  setRequest(request);
    	  setDomain(domain);
    	  setPage(page);
    	  setAction(action);
   	     super. execute();
   	     this.execute();
	}
	@Override
	public void execute() {
		PlayerBean param = new PlayerBean();
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
		System.out.println("크리트"+param.getPlayerId());
		if(PlayerServiceImpl.getInstance().join(param)) {
			System.out.println("회원가입성공");
		
		}else {
			System.out.println("회원가입실패");
		}
	}
}
