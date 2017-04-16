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
<table>
<c:forEach var="allProduct" items="${ allProduct}">  
<tr>  
    <td>${ allProduct.pid}</td>  
    <td>${ allProduct.typeid}</td>  
</tr>  
</c:forEach>  
</table> 
1
</body>
</html>