<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品主页</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/product/splitPage.action" name="from1">
<table>
<c:forEach var="allProduct" items="${ allProduct}">  
<tr>  
    <td>${ allProduct.pid}</td>  
    <td>${ allProduct.storeid}</td>
	<td>${ allProduct.typeid}</td>  
	<td>${ allProduct.pname}</td>  
	<td>${ allProduct.pprice}</td>  
	<td>${ allProduct.pdes}</td>  
	<td>${ allProduct.pno}</td>  
	<td>${ allProduct.pimageno}</td>  
</tr>  
</c:forEach>


<c:forEach var="allType" items="${ allType}">  
<tr>  
    <td>${ allType.typeid}</td>  
    <td>${ allType.typename}</td>
</tr>  
</c:forEach>
</table> 

</form>
</body>
</html>