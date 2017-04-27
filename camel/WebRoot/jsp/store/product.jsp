<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商铺</title>

</head>
<body> 

<form id="itemForm" action="${pageContext.request.contextPath }/product/insertProduct.action" method="post" >
<input type="hidden" name="id" value="${Product.pid }"/>
修改商品信息：
<table width="100%" border=1>
<tr>
	<td>商品编号</td>
	<td><input type="text" name="storeid" value="${Product.storeid }"/></td>
	<tr>
	<td>商品类型</td>
	<td><input type="text" name="typeid" value="${Product.typeid }"/></td>
</tr>
<tr>
	<td>商品名</td>
	<td><input type="text" name="pname" value="${Product.pname }"/></td>
</tr>
<tr>
	<td>商品价格</td>
	<td><input type="text" name="ppricr" value="${Product.ppricr }"/></td>
</tr>

<tr>
	<td>商品描述</td>
	<td><input type="text" name="pdes" value="${Product.pdes }"/></td>
</tr>
<tr>
	<td>商品库存</td>
	<td><input type="text" name="pno" value="${Product.pno }"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>