<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Engine Info Site</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<h1>Welcome to Engine Info</h1>

	<h3>Search By Engine ID</h3>
	<form action="getEngine.do" method="GET">
		Engine ID: <input type="text" name="fid" /> <input type="submit"
			value="Show Engine" />
	</form>
	
	
	<div class="container-fluid">
	<table class= "table table-striped table-hover">
	<thead>
	<tr>
	<th>Engine ID</th>
	<th>Name</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="e" items="${engine}" >
	<tr>
	<td>${engine.id}</td>
	<td><a href="getEngine.do?fid=${e.id}">${e.name}</a></td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	
	</div>
</body>
</html>