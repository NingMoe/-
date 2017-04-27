<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>查询店铺</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/StoreUsesrControl/selectStoreUser.action" >

商品列表：
<table width="100%" border=1>
<tr>
	<td>店铺名称</td>
	<td>用户名</td>
	<td>店铺号码</td>
	<td>店铺号</td>
	<td>操作</td>
</tr>
<c:forEach items="${storeCustom }" var="itemsList">
<tr>
	<td>${itemsList.sname }</td>
	<td>${itemsList.uname }</td>
	<td>${itemsList.sphone }</td>
	<td><a href="${pageContext.request.contextPath }/Store/selectcStore1.action?id=${storeCustom.storeid}"></a></td>
	<td><a href="${pageContext.request.contextPath }/StoreUsesrControl/selectcStore.action?id=${storeCustom.storeid}">修改</a></td>

</tr>
</c:forEach>

</table>
</form>
</body>

</html>