<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<body>
	<#assign base=rc.contextPath />
	<form action="${base}/user/login.do" method="post">
		邮箱：<input type="text" name="email"><br>
		密码：<input type="password" name="password"><br>
		<input type="submit" value="登录">
	</form>
</body>
</html>