<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is the Login Page</title>
</head>
<body bgcolor="gray" >
      <form action="loginData" method="post">
         <input type="text" name="userId" value="" placeholder="Enter ur id"/>
         <input type="password" name="userPwd" value="" placeholder="Enter ur pass"/>
      
        <input type="submit" value="Login"/>
      </form>
   <a href="userSignup"><h3>signup here</h3></a>  
</body>
</html>