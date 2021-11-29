<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: vinicius
  Date: 21/11/2021
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${not empty empresa}">
        <p>empresa: ${ empresa } cadastrada</p>
    </c:if>

    <c:if test="${empty empresa}">
        <p>Nenhuma empresa cadastrada</p>
    </c:if>
</body>
</html>
