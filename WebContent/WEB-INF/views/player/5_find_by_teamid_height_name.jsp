<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 쿼리  -->
<h2>5.팀아이디, 키, 선수성</h2>
<form  id="btn5" action="<%=request.getContextPath()%>/player.do">
   팀아이디	<input type="text" name="teamId"/><br />
	키<input type="text" name="height"/><br />
	선수이름<input type="text" name="playerName"/><br />
	<input type="hidden"  name="action" value="btn5"/><br />
	<input type="hidden"  name="page" value="5_find_by_teamid_height_name"/><br />
	<input type="submit"  value="'전송"/><br />
</form>
<!-- 결과  -->
	<h2>아이디${player.teamId}</h2><br />
	<h2>키${player.height}</h2><br />
	<h2>이름${player.playerName}</h2><br />
