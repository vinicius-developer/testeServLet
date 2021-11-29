<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/remove-empresa" var="removerEmpresa"/>
<c:url value="/update-empresa" var="alterarEmpresa"/>
<c:url value="/nova-empresa" var="novaEmpresa"/>

<%--
  Created by IntelliJ IDEA.
  User: vinicius
  Date: 21/11/2021
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Listas Cadastradas</h1>

    <a href="${novaEmpresa}">Cadastrar nova empresa</a>

    <ul>
        <c:forEach items="${empresas}" var="empresa">
            <li>${empresa.nome}
                - <a href="${removerEmpresa}?empresa=${empresa.id}">Remover</a>
                - <a href="${alterarEmpresa}?empresa=${empresa.id}">Alterar</a>
            </li>
        </c:forEach>
    </ul>

</body>
</html>
