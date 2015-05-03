<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><decorator:title default="Blank Ge"/>&nbsp;&nbsp;${blog.seo}</title>
<decorator:head/>
</head>
<body>
<h1>
<c:out value="${blog.title }"></c:out>
</h1>
<h3>
<c:out value="${blog.subTitle }"></c:out>
</h3>
<c:forEach var="menu" items="${menus}">
<a href="<%=request.getContextPath() %>${menu.menuValue }">${menu.menuName }</a>
</c:forEach>
<!--<a href="<%=request.getContextPath() %>/">首页</a>-->
<hr/>
<decorator:body/>
<div align="center" style="width:100%;border-top:1px solid; float:left;margin-top:10px;">
	CopyRight@2015-2025<br/>
	ICP备案证书号:<a href="http://www.miibeian.gov.cn">苏ICP备14010759号</a>
</div>
</body>
</html>



