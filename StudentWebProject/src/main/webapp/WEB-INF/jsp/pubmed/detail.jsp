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
			<th>나라</th>
			<td>${pd.jnm}</td>
		</tr>
		<tr>
			<th>나라번호</th>
			<td>${pd.isn}</td>
		</tr>
		
			
	</table>
	<div>
		<input type ="button" onclick = "location.href='delete?id=${id}'" value="글삭제" >
	</div>
	
</body>
</html>