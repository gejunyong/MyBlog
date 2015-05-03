<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>博客管理员登陆 - gejunyong.cn java mysql spring strusts2 hibernate mybaties </title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
 <style type="text/css">
    body{
    background: url(<%=request.getContextPath() %>/resources/images/back.png);
	background-color: #444;
    background: url(<%=request.getContextPath() %>/resources/images/pinlayer2.png),url(<%=request.getContextPath() %>/resources/images/pinlayer1.png),url(<%=request.getContextPath() %>/resources/images/back.png);    
}

.vertical-offset-100{
    padding-top:100px;
}    </style>
   <link href="<%=request.getContextPath() %>/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="<%=request.getContextPath() %>/resources/bootstrap/jquery-1.11.2.min.js"></script>
   <script src="<%=request.getContextPath() %>/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row vertical-offset-100">
    	<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h3 class="panel-title">管理员登陆</h3>
			 	</div>
			  	<div class="panel-body">
			    	<form accept-charset="UTF-8" role="form" method="post">
                    <fieldset>
			    	  	<div class="form-group">
			    		    <input class="form-control" placeholder="用户名称"  name="username" type="text">
			    		</div>
			    		<div class="form-group">
			    			<input class="form-control" placeholder="用户密码" name="password" type="password" value="">
			    		</div>
			    		<div>
			    		<span style="color:red;font-size:18px;">${error}</span>
			    		</div>
<!-- 			    	<div class="checkbox">
			    	    	<label>
			    	    		<input name="remember" type="checkbox" value="Remember Me"> Remember Me
			    	    	</label>
			    	    </div>
-->			    	     
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
</div>	
</body>
</html>