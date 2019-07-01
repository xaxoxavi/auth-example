<%--
  Created by IntelliJ IDEA.
  User: xavi
  Date: 1/07/19
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="css/style.css" rel="stylesheet"/>
    <title>Login <%=request.getAttribute("status")%></title>
</head>
<body>
    <div class="wrapper fadeInDown">
        <div class="fadeIn first">
            <img src="https://cdn2.iconfinder.com/data/icons/ios-7-icons/50/user_male2-512.png" id="icon" alt="User Icon" />
        </div>

        <h1><%=request.getAttribute("status")%></h1>

    </div>
</body>
</html>
