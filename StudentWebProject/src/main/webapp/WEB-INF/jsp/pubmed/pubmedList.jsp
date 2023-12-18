
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border ="1">
		<tr>
			<td>번호</td>
			<td>나라</td>
			<td>나라번호</td>
		</tr>
		
		<c:forEach var ="list" items ="${pl}">
		<tr>
			<td>${list.id }</td>
			<td><a href = "detail?id=${list.id}">${list.jnm}</td>
			<td>${list.isn }</td>
		</tr>
		</c:forEach>
		
		<form action ="" method ="get">
			<div>
				<select name ="f">
					<option ${(param.f =="jnm")?"selected":""} value ="jnm">나라</option>
					<option ${(param.f =="isn")?"selected":""} value ="isn">번호</option> 
				</select>
				<input type ="text" name ="q">
				<sapn><input type = "submit"></sapn>
			</div>
		</form>
	</table>
</body>
</html>