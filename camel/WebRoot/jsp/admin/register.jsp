<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/userinsert.action" method="post">
用户账号：<input type="text" name="userid" value="${user.userid }"/><br>
用户名字：<input type="text" name="uname" /><br/>
用户密码 ：<input type="password" name="upassword" /><br/>
用户电话：<input type="text" name="uphone" /><br/>
用户地址：<input type="text" name="uaddr" /><br/>
用户性别：<input type="text" name="usex" /><br/>
用户类型：<input type="text" name="utype" /><br/>
<input type="submit" value="提交"/>
</form>
</body>
</html>