<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>

<form value="login" method="post">
	<div class="path">
			
			<a>Login:</a>
			<label>Username:</label><input type="text" name="e_id" />
			<label>Password:</label><input type="password" name="e_password" />
			<input name="提交" type="submit" class="button" value="Submit" />
			
<!-- 此处的state是返回的ModelAndView中state的值：密码错误！ -->
            	<p>
            	${state}
            	</p>
	</div>
</form>

</body>
</html>