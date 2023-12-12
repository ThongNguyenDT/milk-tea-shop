<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success Page</title>
</head>
<body>
<div>
    <h2><c:out value="${successMessage}" /></h2>
    <form action="/api/products" method="get">
        <button type="submit">Tiếp tục</button>
    </form>
</div>
</body>
</html>
