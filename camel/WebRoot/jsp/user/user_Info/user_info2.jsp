<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/storeInfo.action">
<input type="text" name="nameorid"> <input type="submit" value='ss'/>
</form>
<table>
<c:forEach var="someUsers" items="${someUsers}">  
<tr>  
    <td><a href="${pageContext.request.contextPath }/admin/selectAllUserBy.action?userid=${ someUsers.userid}">${someUsers.userid}</a></td>  
	<td>${someUsers.utype}</td>  
	<td>${someUsers.uname}</td>  
	<td>${someUsers.upassword}</td>  
	<td>${someUsers.uphone}</td>  
	<td>${someUsers.uaddr}</td>  
	<td>${someUsers.usex}</td>  
	<td>${someUsers.umoney}</td>  
	<td><a href="${pageContext.request.contextPath }/admin/userdelete.action?userid=${ someUsers.userid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/selectuser.action?userid=${ someUsers.userid}">更改用户信息</a></td>
</tr>  
</c:forEach>
</table>

</body>
</html>