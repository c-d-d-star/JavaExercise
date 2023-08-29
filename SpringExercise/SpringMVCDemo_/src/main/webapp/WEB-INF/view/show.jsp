<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        /show.jsp,显示request作用域中的数据<br>
        <h2>msg数据：<%=request.getAttribute("msg")%></h2>
        <h2>fun数据：${fun}</h2>
</body>
</html>