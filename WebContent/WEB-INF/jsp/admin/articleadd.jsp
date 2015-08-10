<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin</title>
</head>
<body>
<form method="post" >
<label>类型：</label><input  name="cateGoriesId" type="text"><br>
<label>标签：</label><input  name="labelIds" type="text"><br>
<label>菜单：</label><input  name="menuId" type="text"><br>
<label>标题：</label><input  name="title" type="text"><br>
<label>内容：</label><input  name="content" type="text"><br>
<label>转转链接：</label><input  name="reproducedUrl" type="text"><br>
<label>是否置顶：</label><input  name="topLabel" type="text"><br>
<label>是否显示：</label><input  name="enabled" value="1" type="text"><br>
<input   type="submit" value="添加"><br>
</form>
</body>
</html>