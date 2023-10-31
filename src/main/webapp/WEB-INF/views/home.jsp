<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JSTL Test</h1>

<p>
    The games we play:
    <ul>
        <c:forEach items="${list}" var="game">
            <li>${game}</li>
        </c:forEach>
    </ul>
</p>
</body>
</html>
