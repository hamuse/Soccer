<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포지션 종류</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h2><a  href="#" id="position">2.포지션 종류 보기</a></h2>
<!-- 4. team id로 팀 아이디로 해당 팀의 포지션별 선수 검색기능 예) 수원팀(id: k02)-->
<h2>4. 팀 아이디와 포지션 입력하면 해당 선수 정보 출력</h2>
<form id="btn4"  action="<%=request.getContextPath()%>/player.do">
	팀아이디<input type="text"  name="teamId"/><br/>
	포지션<input type="text" name="position"/><br/>
	<input type="hidden"  name="action" value="btn4"/>
	<input type="hidden"  name="page" value="4_find_by_teamid_position"/>
	<input type="submit" value="전송"/><br/>
</form>	
<h2>5.팀아이디, 키, 선수성</h2>
<form  id="btn5" action="<%=request.getContextPath()%>/player.do">
   팀아이디	<input type="text" name="teamId"/><br />
	키<input type="text" name="height"/><br />
	선수이름<input type="text" name="playerName"/><br />
	<input type="hidden"  name="action" value="btn5"/><br />
	<input type="hidden"  name="page" value="5_find_by_teamid_height_name"/><br />
	<input type="submit"  value="'전송"/><br />
	
</form>
<script>
$('#position').click(function(){
	alert('버튼클릭');
	location.assign('<%=request.getContextPath()%>/player.do?action=find2&page=2_positions');
});
$('#btn4').submit(function(){
	alert('btn4 버튼');
});
$('#btn5').submit(function(){
	alert('btn5 버튼');
});
</script>
</body>
</html>