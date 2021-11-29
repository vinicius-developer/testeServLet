<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/nova-empresa" var="novaEmpresa"/>
<%--
  Created by IntelliJ IDEA.
  User: vinicius
  Date: 21/11/2021
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${novaEmpresa}" method="POST">
        Nome: <input type="text" name="nome">
        <input type="hidden" name="action" value="nova-empresa">
        <input type="submit" value="enviar">
    </form>
</body>
</html>
