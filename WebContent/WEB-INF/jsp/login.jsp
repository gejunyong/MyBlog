<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Parallax Login Form - Bootsnipp.com</title>
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
   <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
     //    $( document ).ready(function() {
     //    var iframe_height = parseInt($('html').height()); 
     //    window.parent.postMessage( iframe_height, 'http://bootsnipp.com');
     //   });
    </script>
</head>
<body>
	
<!-- This is a very simple parallax effect achieved by simple CSS 3 multiple backgrounds, made by http://twitter.com/msurguy -->

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
</div>	<script type="text/javascript">
	$(document).ready(function(){
  $(document).mousemove(function(e){
     TweenLite.to($('body'), 
        .5, 
        { css: 
            {
                backgroundPosition: ""+ parseInt(event.pageX/8) + "px "+parseInt(event.pageY/'12')+"px, "+parseInt(event.pageX/'15')+"px "+parseInt(event.pageY/'15')+"px, "+parseInt(event.pageX/'30')+"px "+parseInt(event.pageY/'30')+"px"
            }
        });
  });
});	</script>
</body>
</html>