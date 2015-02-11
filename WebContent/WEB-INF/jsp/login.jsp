<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的博客登陆</title>
<style type="text/css">
*{overflow:hidden; font-size:9pt;}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(<%=request.getContextPath() %>/resources/images/bg.gif);
	background-repeat: repeat-x;
}

</style></head>

<body>
<form method="post">
<table width="100%"  height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="561" style="background:url(<%=request.getContextPath() %>/resources/images/lbg.gif)"><table width="940" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td height="238" style="background:url(<%=request.getContextPath() %>/resources/images/login01.jpg)">&nbsp;</td>
          </tr>
          <tr>
            <td height="190"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="208" height="190" style="background:url(<%=request.getContextPath() %>/resources/images/login02.jpg)">&nbsp;</td>
                <td align="center" width="518" style="background:url(<%=request.getContextPath() %>/resources/images/login03.jpg)"><table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="40" height="50"><img src="<%=request.getContextPath() %>/resources/images/user.gif" width="30" height="30"></td>
                    <td width="38" height="50">用户</td>
                    <td width="242" height="50"><input name="username" type="text" name="textfield" id="textfield" style="width:164px; height:32px; line-height:34px; background:url(<%=request.getContextPath() %>/resources/images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; font-family:Verdana, Geneva, sans-serif;"></td>
                  </tr>
                  <tr>
                    <td height="50"><img src="<%=request.getContextPath() %>/resources/images/password.gif" width="28" height="32"></td>
                    <td height="50">密码</td>
                    <td height="50"><input type="password" name="password" id="textfield2" style="width:164px; height:32px; line-height:34px; background:url(<%=request.getContextPath() %>/resources/images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; "></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td height="40">&nbsp;</td>
                    <td height="60">
                    <input type="image" src="<%=request.getContextPath() %>/resources/images/login.gif" width="95" height="34"/>
                  </tr>
                </table><span>&nbsp;&nbsp;&nbsp;&nbsp;</span><span style="color:red;font-size:18px;">${error}</span></td>
                <td width="214" style="background:url(<%=request.getContextPath() %>/resources/images/login04.jpg)" >&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="133" style="background:url(<%=request.getContextPath() %>/resources/images/login05.jpg)">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
</body>
</html>