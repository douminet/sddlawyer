<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <link href="favicon.ico" rel="SHORTCUT ICON" />
    <title>斗斗律师服务平台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/add.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/person.css">

  </head>
  
  <body>
  <form action="updPerson" method="post">
	   <div id="personmain" class="personmain">
	    	<div id="fangshitext" class="fangshitext">联系方式</div>
	    	<div>
	  					<input name="person.id" type="text" value="${person.id}" style="display:none;">
	  				</div>
	    	<div id="phone" class="fangshione">
	    		<div id="phonetext" class="onetext">手机:</div>
	    		<div id="phonemain" class="onemain">
					<input name="person.phone" type="text" value="${person.phone}">
				</div>
	    	</div>
	    	<div id="email" class="fangshione">
	    		<div id="emailtext" class="onetext">EMAIL:</div>
	    		<div id="emailmain" class="onemain">
	    			<input name="person.email" type="text" value="${person.email}">
	    		</div>
	    	</div>
	    	<div id="qq" class="fangshione">
	    		<div id="qqtext" class="onetext">QQ:</div>
	    		<div id="qqmain" class="onemain">
	    			<input name="person.qq" type="text" value="${person.qq}">
	    		</div>
	    	</div>
	    	<div id="wangzhi" class="fangshione">
	    		<div id="wangzhitext" class="onetext">网址:</div>
	    		<div id="wangzhimain" class="onemain">
	    			<input name="person.wangzhi" type="text" value="${person.wangzhi}">
	    		</div>
	    	</div>
	    	<div id="address" class="fangshione">
	    		<div id="addresstext" class="onetext">地址:</div>
	    		<div id="addressmain" class="onemain">
	    			<input name="person.address" type="text" value="${person.address}">
	    		</div>
	    	</div>
	    	<div id="anniu" class="anniu">
  					<div id="sub" class="sub">
  						<div id="bc" class="an">
  							<input type="submit" value="保存" align="middle">
  						</div>
  						
  					</div>
  					<div id="reset" class="sub">
  						<div id="bc" class="an">
  							<input type="reset" value="重置" align="middle"/>
  						</div>
  						
  					</div>
  				</div>
	    </div>
    </form>
  </body>
</html>
