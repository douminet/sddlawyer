<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <base href="<%=basePath%>">
    
    <title>我斗记账</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<script language="javascript" type="text/javascript" src="js/WdatePicker.js"></script>
  </head>
  
  <body>
    <form action="wdaccount.action" method="post" class="bootstrap-frm">
<h1>
<span><a href="wdlist.action">辛苦了！老婆！</a></span>
</h1>
<label>
<span>记账金额(￥):</span>
<input id="amount" type="text" name="money.amount" placeholder="花了多少钱" />
</label>
<label>
<span>收入/支出:</span><select name="money.type">
<option value="chu">支出</option>
<option value="ru">收入</option>
</select>
</label>
<label>
<span>相关人:</span><select name="money.name">
<option value="sdd">我斗</option>
<option value="th">胖墩儿</option>
</select>
</label>
<label>
<span>日期:</span>
<!-- <input id="email" type="email" name="email" placeholder="Valid Email Address" /> -->
<input name="money.date" style="width: 120px;" onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})" />
</label>
<label>
<span>用途:</span>
<textarea id="use" name="money.use" placeholder="钱花到哪去了"></textarea>
</label>

<label>
<span>&nbsp;</span>
<input type="submit" class="button" value="保存" />
</label>
</form>
  </body>
</html>
