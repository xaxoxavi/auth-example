<%--
  Created by IntelliJ IDEA.
  User: xavi
  Date: 1/07/19
  Time: 17:44
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    HttpSession session = null;
%>
<%
    session = request.getSession(false);
    if (session == null || session.getAttribute("auth") == null){
        response.sendRedirect("/login.jsp");
    }


%>
<html>
<head>
    <style>
        #content{
            width:200px;
            height: 200px;
            background: url("http://media.gettyimages.com/vectors/set-of-closed-and-open-padlock-icons-vector-vector-id908333810?s=170667a&w=1007")  -200px 0px;
        }
    </style>
    <title>Recurs Protegit</title>
</head>
<body>
    <div id="content">

    </div>

</body>
</html>
