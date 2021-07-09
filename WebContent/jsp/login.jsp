<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/style.css">
<title>ログインページ</title>
</head>
<body>

<h1 class="title">Shop Login Page</h1>

<form action="/SampleLogin/LoginAction" method="post">
<div align="center">
<span class="label label-danger">${message}</span>
<table>
	<tr>
		<th>ID</th>
		<td>
			<input type="text" name="id" size="20">
		</td>
	</tr>
	<tr>
		<th>PASSWORD</th>
		<td>
			<input type="password" name="pass" size="20">
		</td>
	</tr>
	<tr>
		<th></th>
		<td>
			<input type="submit" value="LOGIN" class="button">
		</td>
	</tr>
</table>
</div>
</form>





</body>
</html>