<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1>Login Heree..</h1>
<form:form action="chk" method="post" modelAttribute="logbean">
  Gmail:<input type="text" name="gmail"><br>
  Pass:<input type="password" name="pass"><br>
  <input type="submit" value="Submit">
</form:form>

 <a href="${pageContext.request.contextPath}/newUser">NewUser</a>
</body>
</html>