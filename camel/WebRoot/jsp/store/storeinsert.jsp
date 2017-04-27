<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/storeinsert.action" method="post">
用户id：<input type="text" name="userid" value="${user.userid }"/><br>
商家id：<input type="text" name="storeid" /><br/>
商家名字 ：<input type="text" name="sname" /><br/>
商家电话：<input type="text" name="sphone" /><br/>
<input type="submit" value="提交"/>
</form>
</body>
</html>