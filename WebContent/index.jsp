<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>축구 협회 관리 시스템 </title>
</head>
<body>	
<div id="wrapper" style="width:100%; height:100%">
<h2>축구 협회 관리 시스텝</h2>
<form id="login_form"  action="<%=request.getContextPath()%>/player.do">
	<table border = "1" style="width:500px;height:200px;margin:100px  auto">
	<tr>
		<td style="width:350px;">
				USERID:<input type="text" name="playerId" style="width: 100%; height: 100%"/>
		</td>		
		<td rowspan="2">
		 <input type="submit"  value="로그인" style="width:100%; height:100% "/>
		</td>
	</tr>
	<tr>
		<td>
		   PW :<input type="text" name="solar"/>
		</td>
	</tr>	
</table>
		<input type="hidden" name="action" value="move"/>
		<input type="hidden" name="page" value="home"/>
</form>
<h3 style="width:300px; margin:0  auto"><a id="a_join" href="">회원가입</a></h3>
</div>
</body>
</html>