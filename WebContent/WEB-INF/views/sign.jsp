<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sigh</title>
</head>
<body>
<h1>Signin here..</h1>
<form:form action="sign" method="post" modelAttribute="signbean">
  Gmail:<input type="text" name="gmail"><br>
  Pass:<input type="password" name="pass"><br>
  <input type="submit" value="Submit">
</form:form>
</body>
</html>