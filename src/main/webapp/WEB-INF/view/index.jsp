<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Штаты</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Список штатов</h2>
    <p>В таблице содержится полное и сокращенное название штатов США</p>
    <table class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>№</th>
            <th>Наименование</th>
            <th>Сокращение</th>
        </tr>
        </thead>
        <tbody>
        <jsp:useBean id="states" scope="request" type="java.util.List"/>
        <c:forEach var="state" items="${states}">
            <tr>
                <td>${states.indexOf(state) + 1}</td>
                <td>${state.name}</td>
                <td>${state.shortName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
