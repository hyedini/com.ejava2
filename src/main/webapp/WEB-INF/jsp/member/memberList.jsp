<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>MemberList</title>
</head>
<body>
<c:forEach items="${memberList}" var="list" varStatus="no">
    ${list.id},${list.name}
</c:forEach>
</body>
</html>