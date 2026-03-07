<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Data</title>
</head>
<body bgcolor="pink">
 <label>Employee Details</label><br></br>

<table border="1" cellpadding="8" cellspacing="0">
   <tr>
   <th>empId</th>
   <th>empName</th>
   <th>empMobile</th>
   </tr>
   
    <c:forEach items="${li}" var="n" >
       <tr>
          <td>${n.empId}</td>
          <td>${n.empName}</td>
          <td>${n.empMobNo}</td>
       </tr>
    </c:forEach>

</table>
         
     
</body>
</html>