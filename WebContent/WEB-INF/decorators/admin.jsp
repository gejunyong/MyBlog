<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><decorator:title default="欢迎使用博客管理系统"/></title>
<decorator:head/>
</head>
<body>
<h1><decorator:title/></h1>
<c:if test="${not empty loginUser}">
<a href="<%=request.getContextPath() %>/admin/articleadd">添加博客</a>
<a href="<%=request.getContextPath() %>/admin/articlelist">博客列表</a>
<a href="<%=request.getContextPath() %>/logout">退出系统</a>
管理员:${loginUser.nickname }
</c:if>
<hr/>
<decorator:body/>
<div align="center" style="width:100%;border-top:1px solid; float:left;margin-top:10px;">
	CopyRight@2015-2025<br/>
	ICP备案证书号:<a href="http://www.miibeian.gov.cn">苏ICP备14010759号</a>
</div>
</body>
</html>



