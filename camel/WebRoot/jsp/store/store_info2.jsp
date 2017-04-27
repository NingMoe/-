<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商铺列表</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/jsp/admin/register.jsp">添加用户</a>
<table>
<c:forEach var="somestore" items="${somestore}">  
<tr>  
    <td><a href="${pageContext.request.contextPath }/admin/selectuser.action?userid=${ somestore.storeid}">${somestore.storeid}</a></td>  
	<td>${somestore.userid}</td>  
	<td>${somestore.sphone}</td>
	<td>${somestore.sname}</td>
	<td><a href="${pageContext.request.contextPath }/admin/storedelete.action?storeid=${ somestore.storeid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/selectstore.action?storeid=${ somestore.storeid}">更改商家信息</a></td>
</tr>  
</c:forEach>
</table>
</body>
</html>