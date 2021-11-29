<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/update-empresa" var="updateEmpresa"/>
<%--
  Created by IntelliJ IDEA.
  User: vinicius
  Date: 25/11/2021
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${updateEmpresa}" method="post">
        <input type="hidden" name="id" value="${empresa.id}">
        Nome: <input type="text" name="nome" value="${empresa.nome}">
        <input type="submit" value="enviar">
    </form>
</body>
</html>
