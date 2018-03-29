<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Hi, Welcome to our super-puper secret page!</h1>
<br>
<h2>Here are all our GIRLS users:</h2>

<div class="links">
    <a href="/allusers">All users</a>
    <a href="/newwelcome?idGender=Male">Go to Boys</a>
    <a href="/newwelcome?idGender=Female">Go to Girls</a>
</div>

<c:forEach items="${users}" var="user">
    <p>Name: ${user.name} | Password: ${user.password} | ${user.gender}</p>
</c:forEach>




</body>
</html>