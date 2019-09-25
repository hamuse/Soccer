package com.soccer.web.controllers;



import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.command.Commander;
import com.soccer.web.command.Receiver;
import com.soccer.web.command.Sender;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constant;
import com.soccer.web.serviseImpl.PlayerServiceImpl;
import com.soccer.web.sevices.PlayerService;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Receiver r = new Receiver();
		r.init(request);
		Commander c = new Commander();
		PlayerBean player = null;
		switch (request.getParameter("action")) {
		case "move":
			
				break;
		case "find2":
				request.setAttribute("positions", PlayerServiceImpl.getInstance().frindPositions()); //리퀘스트 받은 정보를  넘겨주는것
			break;
		case "btn4":
			break;
		case "btn5":
			player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setHeight(request.getParameter("height"));
			player.setPlayerName(request.getParameter("playerName"));
			request.setAttribute("player",PlayerServiceImpl.getInstance().findbyTeamIdHeightName(player) );
			break;
				default:
			break;
		}
//		String page = request.getParameter("page");
//		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/"+page+".jsp");
//		rd.forward(request, response);
		Sender.forward(request, response);
			}


}
