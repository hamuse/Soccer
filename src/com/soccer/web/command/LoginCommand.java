package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constant;
import com.soccer.web.serviseImpl.PlayerServiceImpl;

public class LoginCommand extends Command{
  public LoginCommand(HttpServletRequest request) {
	  System.out.println("★★★ 5. LoginCommand 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ,%s",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("domain"),
				request.getParameter("page")));
				
 	  setRequest(request);
	  setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
	  setPage(request.getParameter("page"));
	  setAction(request.getParameter("action"));
	  setView(request.getParameter("main"));
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
//	 if(pb.getPlayerId().equals(request.getParameter(playerId)) && pb.getSolar().equals(request.getParameter(solar)) ) {
//		 setPage(request.getParameter("page"));
//	 }else {
//		 setPage("index");
//	 }
//	
//	 setPage((pb!=null)? request.getParameter("page"):"login");
	 
// 로그인 실패시 로그인페이지로 가게 해야한다. 
//  setPage((!pb.getPlayerId().equals(null)?"playerMain":request.getParameter("login")));

//	 if(!pb.getPlayerId().equals(null) && !pb.getSolar().equals(null)) {
//			super.view = String.format(Constant.DOUBLE_PATH,"player","main");
//	 }else {
//		 
//	 }
  
  //request.getParameter("page")
//	 if(pb != null) {
//         this.view = String.format(Constant.DOUBLE_PATH, "player","main");
//       }else {
//           this.view = String.format(Constant.DOUBLE_PATH, "facade","main");
//       }
	 System.out.println(String.format("로그인에서 pb값 %s", pb));
//	 setPage((pb.getPlayerId().equals(request.getParameter(playerId)) && pb.getSolar()
//			  .equals(request.getParameter(solar))?"main":request.getParameter("login")));
	 System.out.println(String.format("리퀘스트값%s,%s", request.getParameter(playerId),request.getParameter(solar)));
	 if(pb != null) {
    this.view = String.format(Constant.DOUBLE_PATH, "player","main");
 }else {
     this.view = String.format(Constant.DOUBLE_PATH, "player","main");
 }
//	 request.setAttribute("pagename", request.getParameter("page"));
//	  super.execute();
//	 setPage((pb!=null)? request.getParameter("page") :"login");
	 }
}
