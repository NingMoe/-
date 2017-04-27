<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<base href="<%=basePath%>">

<title>购物车</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style style="text/css">
#cont {
	padding: 0px;
	margin: 0px;
	background: #F0F0F0;
}

#head {
	padding: 0px;
	height: 25px;
	background: #F0F0F0;
}

#heder {
	padding: 0px;
	height: 100px;
	background: #ACD6FF;
}

#nav li {
	font-size: 22px;
	list-style-type: none;
	width: 100px;
	margin: 10px 100px 10px 300px;
	float: left;
}

#heder form {
	padding: 50px 20px;
	float: right;
}

input {
	color: #000000;
	padding: 5px;
	width: 300px;
	height: 40px;
	border: 2px solid;
}

button {
	width: 80px;
	height: 40px;
	background: red;
}

#main {
	height: 610px;
	background: #F0F0F0;
	margin: 10px auto;
}

#main1 {
	width: 1000px;
	height: 500px;
	margin: 10px auto;
	border: 1px solid black;
	text-align: center;
}

#main1 table {
	font-size: 15px;
	float: left;
	list-style-type: none;
	margin: 5px;
	border: 1px solid gray;
}

#main2 {
	width: 1000px;
	height: 100px;
	border: 1px solid black;
	margin: 10px auto;
}

#main2 div {
	float: right;

	width: 300px;
	height: 100px;
	border: 1px solid red;
}

#main2 div ul {
	list-style-type: none;
}

#main2 div button {
	float: right;
}

#foot {
	text-align: center;
	height: 200px;
	background: #F0F0F0;
}

#foot li:hover {
	color: red;
}

#foot1  li {
	display: inline;
	list-style-type: none;
	font-size: 10px;
}

#foot2 li {
	display: inline;
	list-style-type: none;
	font-size: 10px;
}
</style>


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
	<div id="cont">

		<div id="head"></div>


		<div id="heder">
		<a style="background-image: url('${pageContext.request.contextPath }/jsp/Picuter/MainIcon.jpg');" href="${pageContext.request.contextPath }">首页</a>
			<form action="" method="post">
				<input type="text">
				<button type="submit">骆驼搜索</button>
			</form>
		</div>



		<div id="main">
			<div id=main1>
				<form action="" id="myfrom" method="get">
					<input type="hidden" name="pid" id="pid"/>
					<input type="hidden" name="number" id="number"/>
					<!-- <input type="button" value="购买" onclick="buy()" /> -->
					<table align="center">

						<tr>
							<td align="center" width="150" >商品名称</td>
							<td align="center" width="150">数量</td>
							<td align="center" width="150">操作</td>
							<td align="center" width="150">操作</td>
							<td align="center" width="150">操作</td>
						</tr>
						<c:forEach var="all" items="${allCarProduct }" varStatus="status">
							<tr>
								<td align="center">${ all.pname}</td>
								<td align="center"><input type="text" value=${ all.number}
									name="${status.index}" id="${status.index}" style="width:50px;"/>
								</td>
								<td align="center"><a 
									href="${pageContext.request.contextPath }/product/DeleteProduct.action?pid=${all.pid}">删除</a>
								</td>
								<td align="center">
									<input style="width:50px;" type="button" value="提交" onclick="sub(${ all.pid},'${status.index}')"/>
								</td>
								<td align="center"><input type="checkbox" name="allpid" value=${ all.pid}/></td>
							</tr>
						</c:forEach>
						
						
					</table>
				</form>
			</div>
			<div id=main2>
				<div>
					<input onclick="buy(${ all.pid})" type="button" value="购买"/>

				</div>

			</div>



		</div>


		<div id="foot">



			<ul id="foot1">
				<li >关于我们</li>
				<li >联系我们</li>
				<li >供应商入驻</li>
				<li >广告平台</li>
				<li >法律声明</li>
			</ul>
			<ul id="foot2">
				<li >手机骆驼</li>
				<li >骆驼物流</li>
				<li >知识产权举报</li>
				<li >PPTV</li>
				<li>骆驼金融</li>
				<li >诚聘英才</li>
			</ul>
		</div>


	</div>

</body>
</html>
