<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>
    
    
    <title>My JSP 'footer.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>css/footer.css">

  </head>
  
  <body>
    <div class="foot">
    	<div class="foot_hr">
    		<hr/>
    	</div>
    	<div class="shengming">
    		<font color="#666695" size="2px">本站部分内容来自互联网，如有侵权请联系站长删除！</font>
    	</div>
    	<div class="beian">
    		<font color="#666695" size="2px">鲁ICP备16003283号</font>
    	</div>
    	
    </div>
  </body>
</html>
