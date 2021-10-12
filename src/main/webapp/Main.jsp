<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22.09.2021
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<%
    String user = null;
    Cookie userC= (Cookie)request.getAttribute("cookie");
    String sessionUser = userC.getValue();
    System.out.println("session user "+sessionUser);

    if (sessionUser == null) {
        response.sendRedirect("index.html");
    } else {
        user = sessionUser;
    }

%>
<h3>
    Hello, <%=user%>! Login Successful!
</h3>
</body>
</html>
