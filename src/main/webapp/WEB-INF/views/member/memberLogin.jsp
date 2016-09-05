<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
<style type="text/css">
	.error-color {
		color: red;
	}
</style>
<script>
  // This is called with the results from from FB.getLoginStatus().
  function statusChangeCallback(response) {
    console.log('statusChangeCallback');
    console.log(response);
    // response 객체는 현재 로그인 상태를 나타내는 정보를 보여준다. 
    // 앱에서 현재의 로그인 상태에 따라 동작하면 된다.
    // FB.getLoginStatus().의 레퍼런스에서 더 자세한 내용이 참조 가능하다.
    if (response.status === 'connected') {
      // 페이스북을 통해서 로그인이 되어있다.
      testAPI();
    } else if (response.status === 'not_authorized') {
      // 페이스북에는 로그인 했으나, 앱에는 로그인이 되어있지 않다.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into this app.';
    } else {
      // 페이스북에 로그인이 되어있지 않다. 따라서, 앱에 로그인이 되어있는지 여부가 불확실하다.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into Facebook.';
    }
  }

  // 이 함수는 누군가가 로그인 버튼에 대한 처리가 끝났을 때 호출된다.
  // onlogin 핸들러를 아래와 같이 첨부하면 된다.
  function checkLoginState() {
    FB.getLoginStatus(function(response) {
      statusChangeCallback(response);
    });
  }

  window.fbAsyncInit = function() {
  FB.init({
    appId      : '1192017394194429',
    cookie     : true,  // 쿠키가 세션을 참조할 수 있도록 허용
    xfbml      : true,  // 소셜 플러그인이 있으면 처리
    version    : 'v2.5' // 버전 2.5 사용
  });

  // 자바스크립트 SDK를 초기화 했으니, FB.getLoginStatus()를 호출한다.
  //.이 함수는 이 페이지의 사용자가 현재 로그인 되어있는 상태 3가지 중 하나를 콜백에 리턴한다.
  // 그 3가지 상태는 아래와 같다.
  // 1. 앱과 페이스북에 로그인 되어있다. ('connected')
  // 2. 페이스북에 로그인되어있으나, 앱에는 로그인이 되어있지 않다. ('not_authorized')
  // 3. 페이스북에 로그인이 되어있지 않아서 앱에 로그인이 되었는지 불확실하다.
  //
  // 위에서 구현한 콜백 함수는 이 3가지를 다루도록 되어있다.

    FB.getLoginStatus(function(response) {
      statusChangeCallback(response);
    });

  };

  // SDK를 비동기적으로 호출
  (function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));

  // 로그인이 성공한 다음에는 간단한 그래프API를 호출한다.
  // 이 호출은 statusChangeCallback()에서 이루어진다.
  function testAPI() {
    console.log('Welcome!  Fetching your information.... ');
    FB.api('/me', function(response) {
      console.log('Successful login for: ' + response.name);
      document.getElementById('status').innerHTML =
        'Thanks for logging in, ' + response.name + '!';
    });
  }
</script>

<!--
  아래는 소셜 플러그인으로 로그인 버튼을 넣는다.
  이 버튼은 자바스크립트 SDK에 그래픽 기반의 로그인 버튼을 넣어서 클릭시 FB.login() 함수를 실행하게 된다.
-->

</head>
<body>
	<div class="container-fluid">
		<form:form action="login.do" commandName="command">
			<div class="col-md-4 col-md-offset-4">
				<div class="text-center" style="margin: 50px 0 50px 0;">
					<h2>Cookcha 로그인</h2>
				</div>
				<div class="form-group">
					<label for="id">아이디</label>
					<form:input path="id" class="form-control" placeholder="userId@email.com"/>
					<form:errors path="id"/>
				</div>
				<div class="form-group">
					<label for="passwd">비밀번호</label>
					<form:password path="passwd" class="form-control" placeholder="비밀번호"/>
					<form:errors path="passwd"/>
				</div>
				<div class="form-group text-center">
				    <div align="center"><form:errors/></div>
    		    	<button type="submit" class="btn btn-info">로그인</button>
    		    	<button type="button" class="btn btn-warning" onclick="location.href='write.do'">회원가입</button>
    		    	<button type="button" class="btn btn-default" onclick="location.href='../index.do'" >홈으로</button>
				</div>
				<div class="form-group text-center">
					<button type="button" class="btn btn-primary btn-block"><i class="fa fa-facebook" aria-hidden="true"></i>&nbsp;&nbsp;페이스북 로그인</button>
					<fb:login-button scope="public_profile,email" onlogin="checkLoginState();"/>
				</div>
				<div class="form-group text-center">
					<button type="button" class="btn btn-success btn-block">N&nbsp;&nbsp;네이버 로그인</button>
				</div>
				<div class="form-group text-center">
					<button type="button" class="btn btn-danger btn-block"><i class="fa fa-google-plus" aria-hidden="true"></i>&nbsp;&nbsp;구글 로그인</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>