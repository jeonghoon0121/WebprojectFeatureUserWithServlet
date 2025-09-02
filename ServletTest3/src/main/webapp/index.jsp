<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Request Parameter</h1>
<h3>GET방식</h3>
<h4>a태그의 href속성에 직접 내용을 쿼리스트링 형태로 작성하여 get방식 요청</h4>
<a href="querystring?name=koala&age=33&birthday=2025-08-06&gender=F&national=ko&hobbies=movie&hobbies=music&hobbies=sleep">
    쿼리스트링을 이용한 값 전달
</a>
<h4>form태그를 이용한 get방식 요청</h4>
<form action="querystring" method="get">
    <label>이름 :</label><input type="text" name="name"><br>
    <label>나이 :</label><input type="number" name="age"><br>
    <label>생일 :</label><input type="date" name="birthday"><br>
    <label>성별 :</label>
    <input type="radio" name="gender" id="male" value="M"><label for="male">남자</label>
    <input type="radio" name="gender" id="female" value="F"><label for="female">여자</label><br>
    <label>국적 :</label>
    <select name="national">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
    </select>
    <label>취미 :</label>
    <input type="checkbox" name="hobbies" id="movie" value="movie"><label for="movie">영화</label>
    <input type="checkbox" name="hobbies" id="music" value="music"><label for="music">음악</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label for="sleep">취침</label><br>
    <input type="submit" value="GET 요청">
</form>
<h3>GET방식</h3>
<h4>a태그의 href속성에 직접 내용을 쿼리스트링 형태로 작성하여 get방식 요청</h4>
<a href="querystring?name=koala&age=33&birthday=2025-08-06&gender=F&national=ko&hobbies=movie&hobbies=music&hobbies=sleep">
    쿼리스트링을 이용한 값 전달
</a>
<h4>form태그를 이용한 post방식 요청</h4>
<form action="formdata" method="post">
    <label>이름 :</label><input type="text" name="name"><br>
    <label>나이 :</label><input type="number" name="age"><br>
    <label>생일 :</label><input type="date" name="birthday"><br>
    <label>성별 :</label>
    <input type="radio" name="gender" id="male" value="M"><label for="male">남자</label>
    <input type="radio" name="gender" id="female" value="F"><label for="female">여자</label><br>
    <label>국적 :</label>
    <select name="national">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
    </select>
    <label>취미 :</label>
    <input type="checkbox" name="hobbies" id="movie" value="movie"><label for="movie">영화</label>
    <input type="checkbox" name="hobbies" id="music" value="music"><label for="music">음악</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label for="sleep">취침</label><br>
    <input type="submit" value="POST 요청">
</form>
<h4></h4>
</body>
</html>