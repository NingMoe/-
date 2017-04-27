<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>店铺详情</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/storeupdate.action" method="post">
用户账号：<input type="text" name="userid" value="${store.userid }"/><br>
商铺id：<input type="text" name="storeid" value="${store.storeid }"/><br/>
商铺名字 ：<input type="text" name="sname" value="${store.sname }"/><br/>
商铺电话：<input type="text" name="sphone" value="${store.sphone }"/><br/>
<input type="submit" value="提交"/>
</form>
${store.storeid }
${store.userid }
${store.sname }
${store.sphone }
</body>
</html>