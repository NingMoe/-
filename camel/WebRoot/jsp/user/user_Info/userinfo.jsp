<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详情</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/userupdate.action" method="post">
用户账号：<input type="text" name="userid" value="${user.userid }"/><br>
用户名字：<input type="text" name="uname" value="${user.uname }"/><br/>
用户密码 ：<input type="password" name="upassword" value="${user.upassword }"/><br/>
用户电话：<input type="text" name="uphone" value="${user.uphone }"/><br/>
用户地址：<input type="text" name="uaddr" value="${user.uaddr }"/><br/>
用户性别：<input type="text" name="usex" value="${user.usex }"/><br/>
用户类型：<input type="text" name="utype" value="${user.utype }"/><br/>
<input type="submit" value="提交"/>
</form>
</body>
</html>