function validateUserForm()
{
var uId=document.getElementById("uid").value;
var uName=document.getElementById("unm").value;
var uRole=document.getElementById("url").value;
var uPassword=document.getElementById("ups").value;
var uConfirmPass=document.getElementById("ucp").value;



if(uId==null || uId==""){
	window.alert("User Id can not be empty.!")
	return false;
}

if(uName==null || uName=="")
	{
	window.alert(" User Name can not be empty.!")
	
	return false;
	}

if(uRole==null || uRole=="")
	{
	window.alert("User Role can not be empty.!")
	
	return false;
	}

if(uPassword==null || uPassword=="")
	{
	window.alert("User Password  can not be empty.!")
	
	return false;
	}

if(uConfirmPass==null || uConfirmPass=="")
	{
	window.alert("User confirm password can not be empty.!")
	
	return false;
	}

	return true;


}