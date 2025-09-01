<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>request-service 메소드</h1>
<h2>GET방식 요청</h2>
<a href="request-servlet">서비스 메소드 요청하기</a><br>
<form action="request-servlet" method="get">
    <input type="submit" value="GET방식 요청 전송">
</form>
<h2>POST방식 요청</h2>
<form action="request-servlet" method="post">
    <input type="submit" value="POST방식 요청 전송">
</form>
</body>
</html>