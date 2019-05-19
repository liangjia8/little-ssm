<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-05-19
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>查询用户</title>
</head>
<body>
<form action="tbItem/select" method="post">
    输入要查询的id:	<input type="text" name="id" value="123456"/>
    <button type="submit">提交</button>
</form>
</body>
</html>