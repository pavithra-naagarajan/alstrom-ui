function validate(){
	alert("Hi")
		var username = document.getElementById("username").value
		var password = document.getElementById("password").value
		var confirmpassword = document.getElementById("confirmpassword").value
		var email = document.getElementById("emailid").value
		var mobile = document.getElementById("mobile").value


	//Mobile validation
	var mobileNumber = document.getElementById("mobileNumber").value;
		if(username.length ==0)
		{
			alert("User name is mandatory");
			return false;
		}
		else if(password.length ==0)
		{
				alert("Password is mandatory");
				return false;
		}
		else if(confirmpassword.length ==0)
		{
				alert("Confirm Password is mandatory");
				return false;
		}
		else if(confirmpassword != password)
		{
				alert("Confirm Password and password must be same");
				return false;
		}
		else if(email.length ==0)
		{
				alert("Email is mandatory");
				return false;
		}
		else if(mobile.length ==0)
		{
				alert("Mobile is mandatory");
				return false;
		}
		else if (mobileNumber.length <10) {
		alert("Enter appropriate 10 digit mobileNumber")
		return false
	}
	
	
	//gender validation
	var group = document.forms[0].gender;
	for(var i=0;i<group.length;i++){
		if(group[i].checked)
		break;
	}
	if(i==group.length)
	{
		alert("select your gender please!")
		return false
	}
	
	//notification validation
	group= document.forms[0].notification;
	for(var i=0;i<group.length;i++){
		if(group[i].checked)
		break;
	}
	if(i==group.length)
	{
		alert("select your notification please!")
		return false
	}
	
	//payment validation
	group = document.forms[0].paymentOptions;
	for(var i=0;i<group.length;i++){
		if(group[i].checked)
		break;
	}
	if(i==group.length)
	{
		alert("select your paymentOptions please!")
		return false
	}
	else{
		alert("you finished your signup!")
	}
	
}




