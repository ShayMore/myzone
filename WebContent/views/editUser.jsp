<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>编辑用户</title>
    
	<script type="text/javascript">
	function updateUser(){
		var form = document.forms[0];
		form.action = "<%=basePath%>user/updateUser";
		form.method="post";
		form.submit();
	}
</script>

  </head>
  
  <body>
    <h1>编辑用户</h1>
	<form action="" name="userForm">
		<input type="hidden" name="userid" value="${user.userid }"/>
		姓名：<input type="text" name="username" value="${user.username }"/>
		年龄：<input type="text" name="upasswd" value="${user.upasswd }"/>
		<input type="button" value="编辑" onclick="updateUser()"/>
	</form>
  </body>
  
</html>
