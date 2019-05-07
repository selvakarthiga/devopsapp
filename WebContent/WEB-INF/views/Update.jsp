<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DeleteHere...</title>
</head>
<body>

<h1>Delete Heree..</h1>
<form:form action="update" method="post" modelAttribute="updatebean">
  Name:<input type="text" name="name"><br>
  Cost:<input type="text" name="cost"><br>
  <input type="submit" value="Submit">
</form:form>

</body>
</html>