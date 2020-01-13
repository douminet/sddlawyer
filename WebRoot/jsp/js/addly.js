
var name = document.getElementById("name");
var email = document.getElementById("email");
var qqwx = document.getElementById("qqwx");
var phone = document.getElementById("phone");
var fangshi = document.getElementById("fangshi");
var title = document.getElementById("title");
var main = document.getElementById("main");
var re = new RegExp("^[0-9]*$");
var phoners = re.test(phone);

function isacp(){
	if(name==""){
		alert("姓名不能为空");
	}else if(phone==""){
		alert("电话不能为空");
	}else if(fangshi==""){
		alert("联系方式不能为空");
	}else if(title==""){
		alert("标题不能为空");
	}else if(main==""){
		alert("内容不能为空");
	}else if(!phoners){
		alert("电话只能输入数字");
	}else{
		document.liuyan.dosubmit.click();
	}
}


















