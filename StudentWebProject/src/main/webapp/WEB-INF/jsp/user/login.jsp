<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
${ment}
</div>
	<form action="" method="post">
		<table border=1>
			<tr>
				<td><label>ID</label>
				<td><input placeholder="ID" type="text" id="id" name="id" ></td>
			</tr>
			<tr>
				<td><label>PASSWORD</label>
				<td><input placeholder="PASSWORD" type="password" id="pass" name="pass"></td>
			</tr>
		</table>
		<input type="submit" value="로그인">
		<input type="button" value="회원가입" onClick="location.href='/user/signup'">
		
	</form>
</body>
</html>