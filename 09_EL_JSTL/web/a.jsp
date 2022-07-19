<%--
  Created by IntelliJ IDEA.
  User: Adil
  Date: 7/19/2022
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("key","值");
    %>
    表达式脚本输出key的值是:<%=request.getAttribute("key")%><br>
    EL表达式输出key的值是: ${key}
</body>
</html>
