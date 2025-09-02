1. 서블릿 생명주기 init service destory
2. 요청전달 get, post 방식 
3. 내용전달 스트링 전달 form  get전달, post전달


# WebprojectFeatureUserWithServlet

project 만들기
1. Generators : Jakarta EE
2. Application server : Tomcat 11.0.10
3. JDK : 17이상
4. configuration edit :  vmoption  -Dfile.encoding=UTF-8
  한글 관련 이상할때 이 설정 점검
6. Deployment : /이하 삭제
  url 길때 삭제

서블릿 종류 1. xml mapping 방법 2. annotation 방법

서블릿 생명주기
1. xml mapping방법, annotation 방법 (둘다 동일)

 - init 톰캣 서버 실행시 생성
 - servlet, httpservlet  인덱스.jsp 파일에서 버튼 클릭시에 시작
 - 뒤로가기 누른후 다시 버튼을 누르면 httpservice 만 증가
 - destroy 톰캣 서버 종료시 생성된후 종료 

2. 요청전달

  annotation방법 사용하기
  1. public class 위에[ @Webservlet 어노테이션  ex) @Webservlet("/request-service")
  2. public class 우측에 extends HttpServlet 상속받기
  3. service 오버라이드하기 

   - 서비스 요청 전달 -> get방식
   - get 방식 요청전달
   - post 방식 요청전달


3. 내용전달
  1.a태그의 href속성에 직접 파라미터를 쿼리스트링 형태로 작성하여 get방식 요청
  2.form get방식
  3.form post방식   
   
href속성에 직접 파라미터를 전달하는 방법과 form get방식 전달은 비슷하다. 




trouble shooting 
1. @WebServlet("") ""안의 url은 반드시 앞에 /가 있어야한다.
2. super.doGet(req, resp)은 405에러를 생성한다.
3. name이 같은경우 500에러를 생성한다. 
