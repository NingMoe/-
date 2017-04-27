<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录吧</title>
    
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
	width: 100%;
	height: 100%;
	background: #F0F0F0;
	border: 1px solid black;
}

#head {
	position: relative;
	width: 1000px;
	height: 100px;
	margin: 0 auto;
}

#head img {
	width: 160px;
	height: 100px;
	padding: 0;
	margin: 0;
}

#head a {
	padding-top: 50px;
	padding-right: 80px;
	float: right;
	color: black;
	text-decoration: none;
}

#head a:hover {
	color: red;
	text-decoration: underline;
}

#main {
	padding-top: 100px;
	position: relative;
	margin: 0 auto 20px;
	width: 600px;
	height: 300px;
	background: #FFFFFF;
	border-top: 5px solid skyblue;
	border-right: 1px solid black;
	border-bottom: 1px solid black;
	border-left: 1px solid black;
	text-align: center;
}

#foot {
	position: relative;
	position: relative;
	margin: 10px auto;
	text-align: center;
	height: 100px;
	width: 800px;
}

#foot li {
	color: black;
	text-decoration: none;
}

#foot li:hover {
	color: red;
	text-decoration: underline;
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
<script type="text/javascript">
	function sts() {
		alert("傻鸟你点错了！");
	}
</script>
</head>

<body>

	<div id="cont">
		<div id="head">

			<img alt="wen" src="../photo/logo.jpg"> <a href="jsp/login_reg/register.jsp">还没注册，先注册></a>


		</div>
		<div id="main">

			<form action="${pageContext.request.contextPath }/loginReg/login.action" method="post">
				<p>
					用&nbsp;户&nbsp;id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="userid" />
				</p>
				<p>
					密&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="password" name="upassword">
				</p>
				


				<p>
					<input type="submit" name="reginster" value="登录"
						style="width:250px;height:30px; background:skyblue" />
			</form>

		</div>

		<div id="foot">


			<ul id="foot1">
				<li onclick="sts()">关于我们</li>
				<li onclick="sts()">联系我们</li>
				<li onclick="sts()">供应商入驻</li>
				<li onclick="sts()">广告平台</li>
				<li onclick="sts()">法律声明</li>
			</ul>
			<ul id="foot2">
				<li onclick="sts()">手机骆驼</li>
				<li onclick="sts()">骆驼物流</li>
				<li onclick="sts()">知识产权举报</li>
				<li onclick="sts()">PPTV</li>
				<li onclick="sts()">骆驼金融</li>
				<li onclick="sts()">诚聘9英才</li>
			</ul>
		</div>


	</div>

</body>
</html>
