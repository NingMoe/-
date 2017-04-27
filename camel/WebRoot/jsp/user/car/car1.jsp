<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
<!-- 下面是传参的方法 包括两个隐藏的<input/>-->
<script type="text/javascript" language="javascript">
	function sub(pid,index) {
		var number=document.getElementById(index).value;
		document.getElementById("number").value =number;
		document.getElementById("pid").value =pid;
		document.getElementById("myfrom").action="${pageContext.request.contextPath }/product/updateCar.action";
		myfrom.submit();
	}
	function buy() {
		document.getElementById("myfrom").action="${pageContext.request.contextPath }/jsp/user/order/order_info.jsp";
		myfrom.submit();
	}
</script>
</head>
<body>
	<!-- 一下测试代码 不需要可以自行删除 -->
	
	<form
		action=""
		id="myfrom">
		<input type="hidden" name="pid" id="pid"/>
		<input type="hidden" name="number" id="number"/>
		<input type="button" value="购买" onclick="buy()" />
		<table border="1">
			<c:forEach var="all" items="${allCarProduct }" varStatus="status">
				<tr>
					<%-- <td><input type="hidden" value=${ all.pid} name="pid+${status.index}"/></td> --%>
					<td><input type="checkbox" name="allpid" value=${ all.pid}/></td>
					<td>${ all.pid}</td>
					<td>${ all.userid}</td>
					<td><input type="text" value=${ all.number}
						name="${status.index}" id="${status.index}"/>
					</td>
					<td>${ all.pname}</td>
					<td><a
						href="${pageContext.request.contextPath }/product/DeleteProduct.action?pid=${all.pid}">删除</a>
					</td>
					<td>
						<input type="button" value="提交" onclick="sub(${ all.pid},'${status.index}')"/>
					</td>
					
				</tr>
			</c:forEach>
		
		</table>
		<input onclick="buy(${ all.pid})" type="button" value="购买"/>
	</form>
	
</body>
</html>