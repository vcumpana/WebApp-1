<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title></title>
    <style type="text/css">
        <%@include file="../resources/style.css"%>
    </style>
</head>
<body>
<h1>Hi, Welcome to our super-puper secret page!</h1>
<br>
<div class="links">
    <a href="/welcome?genderId=Female">Girls</a>
    <a href="/welcome?genderId=Male">Boys</a>
    <a href="/allusers">AllUsers</a>
</div>

<h2>Here are all our users:</h2>
<c:forEach items="${users}" var="user">
    <p>Name: ${user.name} | Password: ${user.password} | Gender: ${user.gender}</p>
</c:forEach>
</body>
</html>