<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fill your Information</h1>
<form action="save" method="get">
Name:<input type="text" name="name"><br>
Password:<input type="password" name="password"><br>
<select name="batch">
    <option value="volvo">Batch 1</option>
    <option value="saab">Batch 2</option>
    <option value="fiat">Batch 3</option>
    <option value="audi">Batch 4</option>
  </select>
<input type="submit" value="submit">
</form>
</body>
</html>