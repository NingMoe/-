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
<form action="${pageContext.request.contextPath }/product/selectstore1.action" >

商品列表：
<table width="100%" border=1>
<tr>
	
	<td>用户id</td>
	<td>商铺名</td>
	<td>商品编号</td>
	<td>商品名</td>
	<td>商品价格</td>
	<td>商品描述</td>
	<td>商品库存</td>
	
</tr>
<c:forEach items="${store2 }" var="store2">
<tr>
	<td>${store2.userid }</td>
	<td>${store2.sname }</td>
	<td>${store2.pid }</td>
	<td>${store2.pname }</td>
	<td>${store2.pprice }</td>
	<td>${store2.pdes }</td>
	<td>${store2.pno }</td>
	<td><a href="${pageContext.request.contextPath }/producte/selectProductCustomsById.action?id=${store2.pid}">修改</a></td>
	<td><a href="${pageContext.request.contextPath }/producte/deleteStoreProduct.action?id=${store2.pid}">删除</a></td>
</tr>
</c:forEach>
</table>
<table width="100%" border=1>
<tr>
<td><input type="submit" value="增加商品"/></td>
</tr>
</table>
</form>
</body>

</html>