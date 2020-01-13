<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>">
    
    <link href="favicon.ico" rel="SHORTCUT ICON" />
    <title>斗斗律师服务平台</title>
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>css/addliuyan.css">
	<!--<link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>js/addly.js">-->
	<script type="text/javascript">
		
		
		
		function isacp(){
			var name = document.getElementById('nameip').value;
			var email = document.getElementById('emailip').value;
			var qqwx = document.getElementById('qqwxip').value;
			var phone = document.getElementById('phoneip').value;
			var title = document.getElementById('titleip').value;
			var main = document.getElementById('mainip').value;
			var fangshi = document.getElementsByName('liuYan.l_fangshi');
			var fslength = fangshi.length;
			var isfs = false;
			
			var r=/^((0\d{2,3}-\d{7,8})|(1[3584]\d{9}))$/;
			var r1=/^((0\d{2,3}\d{7,8})|(1[3584]\d{9}))$/;
			var phoners = r.test(phone);
			var phoners2 = r1.test(phone);
			for(var i=0;i<fslength;i++){
				if(fangshi[i].checked==true){
					isfs = true;
					break;
				}
			}
			if(name==""){
				alert("姓名不能为空");
			}else if(phone==""){
				alert("电话不能为空");
			}else if(!phoners&&!phoners2){
				alert("电话格式有误");
			}else if(!isfs){
				alert("请至少选择一项联系方式");
			}else if(title==""){
				alert("标题不能为空");
			}else if(main==""){
				alert("内容不能为空");
			}else{
				document.liuyan.dosubmit.click();
			}
		}

	</script>
	</head>
  
  <body>
     <div id="rightmain" class="rightmain">
    	<div id="righthead" class="righthead">
    		<div id="headtitle" class="headtitle">
    			留言板
    		</div>
    		
    	</div>
    	<form id="liuyan" name="liuyan" action="addLiuYan" method="post">
    	<div id="rightmiddle" class="rightmiddle">
    		<div id="hr" class="hr">
				<HR style="FILTER: progid:DXImageTransform.Microsoft.Shadow(color:#987cb9,direction:145,strength:1)" width="90%" color=#987cb9 SIZE=1>
			</div>
   			<div id="nameinput" class="input" style="display: none;">
   				<input type="text" name="huiFu.isyk" value="1"/>1
   			</div>
    		<div id="wenzi" class="liuyanhang">
    			<div class="hangtext">如果您有任何意见建议或者需求，欢迎在此留言</div>
    			<div class="hangtext"><font size="2" color="red">带有"*"项为必填</font></div>
    		</div>
    		<div id="name" class="liuyanhang">
    			<div id="nametext" class="text">
    			<font size="2" color="red">*</font>姓名:</div>
    			<div id="nameinput" class="input">
    				<input id="nameip" type="text" name="liuYan.l_name"/>
    			</div>
    			<div id="tishi" class="tishi" style="display: none;">
    				<font size="2" color="red">姓名不能为空</font>
    			</div>
    		</div>
    		<div id="sex" class="liuyanhang">
    			<div id="sextext" class="text">
    			<font size="2" color="red">*</font>性别:</div>
    			<div id="sexinput" class="input">
    				<input id="sexip" type="radio" name="liuYan.l_sex" value="男" checked="checked">男
    				<input id="sexip" type="radio" name="liuYan.l_sex" value="女">女
    			</div>
    		</div>
    		
    		<div id="email" class="liuyanhang">
    			<div id="emailtext" class="text">
    			电子邮箱:</div>
    			<div id="emailinput" class="input">
    				<input id="emailip" type="text" name="liuYan.l_email"/>
    			</div>
    		</div>
    		<div id="address" class="liuyanhang">
    			<div id="addresstext" class="text">
    			QQ/微信:</div>
    			<div id="addressinput" class="input">
    				<input id="qqwxip" type="text" name="liuYan.l_address"/>
    			</div>
    		</div>
    		<div id="phone" class="liuyanhang">
    			<div id="phonetext" class="text">
    			<font size="2" color="red">*</font>电话:</div>
    			<div id="phoneinput" class="input">
    				<input id="phoneip" type="text" name="liuYan.l_phone"/>
    			</div>
    			<div id="tishi" class="tishi" style="display: none;">
    				<font size="2" color="red">电话不能为空</font>
    			</div>
    		</div>
    		<div id="wenzi" class="liuyanhang">
    			<div class="hangtext">
    			<font size="2" color="red">*</font>您希望我们以何种方式与您联系</div>
    		</div>
    		<div id="fangshi" class="liuyanhang">
    			<div id="fangshilist" class="fangshilist">
    				<input id="fangshiip1" type="checkbox" name="liuYan.l_fangshi" value="在线回复">在线回复
    				<input id="fangshiip2" type="checkbox" name="liuYan.l_fangshi" value="电话回复" />电话回复
    				<input id="fangshiip3" type="checkbox" name="liuYan.l_fangshi" value="QQ/微信回复" />QQ/微信回复
    			</div>
    		</div>
    		<div id="tishi" class="tishi" style="display: none;">
    				<font size="2" color="red">方式不能为空</font>
    			</div>
    		<div id="title" class="liuyanhang">
    			<div id="titletext" class="text">
    			<font size="2" color="red">*</font>标题:</div>
    			<div id="titleinput" class="input">
    				<input id="titleip" type="text" name="liuYan.l_title"/>
    			</div>
    			<div id="tishi" class="tishi" style="display: none;">
    				<font size="2" color="red">标题不能为空</font>
    			</div>
    		</div>
    		<div id="main" class="liuyanhang">
    			<div id="maintext" class="text">
    			<font size="2" color="red">*</font>内容:</div>
    			<div id="maininput" class="maininput">
    				<textarea id="mainip" name="liuYan.l_main" rows="10" cols="30"></textarea>
    			</div>
    			<div id="tishi" class="tishi" style="display: none;">
    				<font size="2" color="red">内容不能为空</font>
    			</div>
    		</div>
    		
    		<div id="subandreset" class="subandreset">
    			<div id="submit" class="submitkuang">
    				<div class="submit">
    					<input id="baocun" name="baocun" type="button" value="保存" onclick="isacp()">
    				</div>
    			</div>
    			<div id="submit" class="submitkuang" style="display: none;">
    				<div class="submit">
    					<input id="dosubmit" name="dosubmit" type="submit" onclick="javascript:window.alert('谢谢您的留言')"">
    				</div>
    			</div>
    			<div id="reset" class="resetkuang">
    				<div class="reset">
    					<input type="reset" value="重置">
    				</div>
    			</div>
    		</div>
    	</div>
    	</form>
    </div>
  </body>
</html>
