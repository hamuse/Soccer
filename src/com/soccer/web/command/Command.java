package com.soccer.web.command;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constant;

import lombok.Data;
@Data
public class Command implements Order {
    protected HttpServletRequest request;
    protected String action, domain, page, view;
	@Override
	public void execute() {
		System.out.println("★★★  4. Command 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		this.view = String.format(Constant.DOUBLE_PATH,"facade",page);
	}

}
