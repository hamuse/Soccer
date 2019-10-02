<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/head.jsp"/>
<h2>playerMain 보여주기</h2>
<div></div> <div><h1>playerMain</h1></div> <div></div> 
<c:choose>
<c:when test="${page eq null}">
<jsp:include page="2_positions_q.jsp"/>
</c:when>
 <c:when test="${page eq '2_positions_q'}">
<jsp:include page="2_positions_q.jsp"/>
</c:when>
<c:when test="${page eq '2_positions_a'}">
<jsp:include page="2_positions_a.jsp"/>
</c:when>
</c:choose>
<script>
app.init('${ctx}');
</script>
<jsp:include page="../common/foot.jsp"/>