<%--
  Created by IntelliJ IDEA.
  User: hnjh1
  Date: 2025-09-02
  Time: 오후 5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>forward and redirect</title>
  </head>
  <body>
    <ul>
      <form action="forward" method="post">
        <input type="text" name="userId">
        <input type="password" name="password">
        <button type="submit" style="height: 50px">로그인 </button>
      </form>
      <li><a href="othersite">다른 웹사이트로 redirect</a></li>
      <li><a href="otherservelet">다른 서브릿으로 redirect</a></li>
    </ul>
  </body>
</html>
