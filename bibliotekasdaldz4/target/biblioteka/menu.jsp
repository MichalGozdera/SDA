<%--
  Created by IntelliJ IDEA.
  User: Cokeman
  Date: 04.02.2018
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${isLogged eq false}">
    <ul>
        <li><a href="./home">Strona główna</a></li>
        <li><a href="./register">Rejestracja</a></li>
        <li><a href="./login">Logowanie</a></li>
    </ul>
</c:if>
<c:if test="${isLogged eq true}">
    <ul>

    <li><a href="./home?"+${username}>Strona główna</a></li>
    <c:if test="${not empty username}">
        <li>Witaj ${username}</li>
    </c:if>
        <form action="./logout" method="POST">
            <input type="submit" value="logout">
        </form>
        </ul>
</c:if>