<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="com.userlist.vo.UserListVO" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<%
		List<UserListVO>list =(List<UserListVO>)request.getAttribute("ul");
	%>
</head>
<body>
	<table boarad="1">
		<tr>
			<td>번호</td>
			<td>ID</td>
			<td>pwd</td>
			
		</tr>
		<!-- 리스트 시작 -->
		<% for(UserListVO ul : list){ %>
			<tr>
				<td><%=ul.getNum() %></td>
				<td><%=ul.getUid() %></td>
				<td><%=ul.getUpwd() %></td>
				
				<td></td>
			</tr>
			<%
			}
			%>
	
	</table>
</body>
</html>