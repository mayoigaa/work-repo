<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<table border="1">
		<tr>
			<th>글쓴이</th>
			<td>${bd.user}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${bd.title}</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${bd.regdate}</td>
		</tr>
		<tr>
			<th colspan ="2">내용</th>
		</tr>
		<tr>
			<th colspan ="2">${bd.memo}</th>
		</tr>
			
	</table>
	<div>
		<input type ="button" onclick = "location.href='update?brdno=${brdno}'" value="글수정" >
	</div>
	<div>
		<input type ="button" onclick = "location.href='delete?brdno=${brdno}'" value="글삭제" >
	</div>
	
</body>
</html>