package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constant;
import com.soccer.web.serviseImpl.PlayerServiceImpl;

public class LoginCommand extends Command{
  public LoginCommand(HttpServletRequest request) {
	  System.out.println("★★★ 5. LoginCommand 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
 	  setRequest(request);
	  setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
	  setPage(request.getParameter("page"));
	  setAction(request.getParameter("action"));
	  execute();
  }
  @Override
	 public void execute() {
	 String playerId = request.getParameter("playerId");
	 String solar =request.getParameter("solar");
	 PlayerBean pb = new PlayerBean();
	 pb.setPlayerId(playerId);
	 pb.setSolar(solar);
	 pb = PlayerServiceImpl.getInstance().login(pb);
//	 System.out.println("10.DB에서 커맨드로 전달된 로그인 객체: "+ pb.toString());
//	 if(pb.getPlayerId() !=null) {
//		 setPage(request.getParameter("page"));
//	
//	 }else{
//		 setPage("index");
//	 }
	 setPage((pb!=null)? request.getParameter("page"):"login");
	  super.execute();

	 }
}
